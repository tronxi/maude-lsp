import path = require("path");
import * as net from 'net';
import { ChildProcess, spawn } from 'mz/child_process';
import * as vscode from "vscode";
import {
  LanguageClientOptions,
  RevealOutputChannelOn,
} from "vscode-languageclient";

import {
  LanguageClient,
  ServerOptions,
  State,
  StreamInfo,
} from "vscode-languageclient/node";

const serverJarPath = '/Users/tronxi/workspace/maude-lsp/maude-ls-client-vscode/maude-ls-0.0.1-SNAPSHOT-jar-with-dependencies.jar';

export class BallerinaExtension {
  private languageClient?: LanguageClient;
  private context?: vscode.ExtensionContext;

  setContext(context: vscode.ExtensionContext) {
    this.context = context;
  }


  async init(): Promise<void> {
    console.log("paso")
    var logChannel = vscode.window.createOutputChannel("Maude");
    logChannel.appendLine("Starting the Ballerina Language Server Extension!");
    logChannel.show(true);
    try {
      const tcpServerOptions = () =>
      new Promise<ChildProcess | StreamInfo>((resolve, reject) => {
        const server = net.createServer(socket => {
          logChannel.appendLine('Ballerina Language Server Process Disconnected')
          socket.on('end', () => {
            logChannel.appendLine('Ballerina Language Server Process Disconnected')
          });
          server.close()
          resolve({ reader: socket, writer: socket })
        });
        server.listen(9925, '127.0.0.1', () => {
          const childProcess = spawn('java', ['-jar', serverJarPath]);
          childProcess.stderr.on('data', (chunk: Buffer) => {
            const str = chunk.toString();
            logChannel.appendLine('Ballerina Language Server:' + str);
          });
          childProcess.stdout.on('data', (chunk: Buffer) => {
            logChannel.appendLine('Ballerina Language Server:' + chunk + '');
          });
          childProcess.on('exit', (code, signal) => {
            logChannel.appendLine(
              `Language server exited ` + (signal ? `from signal ${signal}` : `with exit code ${code}`)
            );
            if (code !== 0) {
              logChannel.show()
            }
          });
          return childProcess
        });
      });
      //creating the language client.
      let clientId = "ballerina-vscode-lsclient";
      let clientName = "Ballerina LS Client";
      let clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: "file", language: "maude" }],
        outputChannel: logChannel,
        revealOutputChannelOn: RevealOutputChannelOn.Never,
      };
      this.languageClient = new LanguageClient(
        clientId,
        clientName,
        tcpServerOptions,
        clientOptions
      );

      const disposeDidChange = this.languageClient.onDidChangeState(
        (stateChangeEvent) => {
          if (stateChangeEvent.newState === State.Stopped) {
            vscode.window.showErrorMessage(
              "Failed to initialize the extension"
            );
          } else if (stateChangeEvent.newState === State.Running) {
            console.log("running");
            vscode.window.showInformationMessage(
              "Extension initialized successfully!"
            );
          }
        }
      );

      let disposable = this.languageClient.start();
      this.languageClient.onReady().then(() => {
        disposeDidChange.dispose();
        this.context!.subscriptions.push(disposable);
      });
    } catch (exception) {
      return Promise.reject("Extension error!");
    }
  }
}

export const extensionInstance = new BallerinaExtension();