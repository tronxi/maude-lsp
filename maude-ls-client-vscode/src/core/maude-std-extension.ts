import * as vscode from "vscode";
import {LanguageClientOptions, RevealOutputChannelOn } from "vscode-languageclient";
import {LanguageClient, ServerOptions} from "vscode-languageclient/node";

export class MaudeStdExtension {
  private languageClient?: LanguageClient;
  private context?: vscode.ExtensionContext;

  setContext(context: vscode.ExtensionContext) {
    this.context = context;
  }

  async init(): Promise<void> {
    var serverJarPath = this.context!.asAbsolutePath('maude-ls-0.0.1-SNAPSHOT-jar-with-dependencies.jar');
    var logChannel = vscode.window.createOutputChannel("Maude");
    logChannel.appendLine("Starting the Maude Std Language Server Extension!");
    logChannel.show(true);
    try {

      const serverOptions: ServerOptions = {
        command: 'java',
        args: ['-jar', serverJarPath, "std"],
      };

      const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: "file", language: "maude" }],
        outputChannel: logChannel,
        revealOutputChannelOn: RevealOutputChannelOn.Never,
      };
      
      const clientId = "maude-vscode-lsclient";
      const clientName = "Maude LS Client";
      this.languageClient = new LanguageClient(
        clientId,
        clientName,
        serverOptions,
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

export const maudeStdExtension = new MaudeStdExtension();