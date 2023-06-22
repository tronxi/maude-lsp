import * as vscode from "vscode";
import {LanguageClientOptions, RevealOutputChannelOn } from "vscode-languageclient";
import {LanguageClient, State, ServerOptions} from "vscode-languageclient/node";

const serverJarPath = '/Users/tronxi/workspace/maude-lsp/maude-ls-client-vscode/maude-ls-0.0.1-SNAPSHOT-jar-with-dependencies.jar';

export class MaudeStdExtension {
  private languageClient?: LanguageClient;
  private context?: vscode.ExtensionContext;

  setContext(context: vscode.ExtensionContext) {
    this.context = context;
  }

  async init(): Promise<void> {
    var logChannel = vscode.window.createOutputChannel("Maude");
    logChannel.appendLine("Starting the Maude Std Language Server Extension!");
    logChannel.show(true);
    try {
      const serverOptions: ServerOptions = {
        command: 'java',
        args: ['-jar', serverJarPath, "std"],
      };
      let clientId = "maude-vscode-lsclient";
      let clientName = "Maude LS Client";
      let clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: "file", language: "maude" }],
        outputChannel: logChannel,
        revealOutputChannelOn: RevealOutputChannelOn.Never,
      };
      this.languageClient = new LanguageClient(
        clientId,
        clientName,
        serverOptions,
        clientOptions
      );

      const disposeDidChange = this.languageClient.onDidChangeState(
        (stateChangeEvent) => {
          if (stateChangeEvent.newState === State.Stopped) {
            vscode.window.showErrorMessage(
              "Failed to initialize the extension"
            );
          } else if (stateChangeEvent.newState === State.Running) {
            vscode.window.showInformationMessage(
              "Maude extension initialized successfully!"
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

export const maudeStdExtension = new MaudeStdExtension();