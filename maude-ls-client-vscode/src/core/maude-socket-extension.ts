import * as net from 'net';
import { ChildProcess, spawn } from 'mz/child_process';
import * as vscode from "vscode";
import { LanguageClientOptions, RevealOutputChannelOn} from "vscode-languageclient";
import {LanguageClient, StreamInfo} from "vscode-languageclient/node";

export class MaudeSocketExtension {
  private languageClient?: LanguageClient;
  private context?: vscode.ExtensionContext;

  setContext(context: vscode.ExtensionContext) {
    this.context = context;
  }


  async init(): Promise<void> {
    var serverJarPath = this.context!.asAbsolutePath('maude-ls-0.0.1-SNAPSHOT-jar-with-dependencies.jar');

    var logChannel = vscode.window.createOutputChannel("Maude");
    logChannel.appendLine("Starting the Maude Socket Language Server Extension!");
    logChannel.show(true);

    try {

      const tcpServerOptions = () =>
      new Promise<ChildProcess | StreamInfo>((resolve, reject) => {
        const server = net.createServer(socket => {
          socket.on('end', () => {
            logChannel.appendLine('Maude Language Server Process Disconnected')
          });
          server.close()
          resolve({ reader: socket, writer: socket })
        });
        server.listen(9925, '127.0.0.1', () => {
          return spawn('java', ['-jar', serverJarPath, "socket"]);
        });
      });

      const clientId = "maude-vscode-lsclient";
      const clientName = "Maude LS Client";
      const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: "file", language: "maude" }],
        outputChannel: logChannel,
        revealOutputChannelOn: RevealOutputChannelOn.Never,
        synchronize: {
          configurationSection: ['maude'],
          fileEvents: [
            vscode.workspace.createFileSystemWatcher('**/*.maude'),
          ],
        },
      };

      this.languageClient = new LanguageClient(
        clientId,
        clientName,
        tcpServerOptions,
        clientOptions
      );

      try {
        await this.languageClient.start();
      } catch(error){
        vscode.window.showErrorMessage(
          "Failed to initialize the extension"
        );
      }
      vscode.window.showInformationMessage(
        "Maude extension initialized successfully!"
      );
    } catch (exception) {
      return Promise.reject("Extension error!");
    }
  }
}

export const maudeSocketExtension = new MaudeSocketExtension();