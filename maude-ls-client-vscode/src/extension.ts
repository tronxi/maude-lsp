import * as vscode from 'vscode';
import { maudeStdExtension } from './core/maude-std-extension';
import { maudeSocketExtension } from './core/maude-socket-extension';

export function activate(context: vscode.ExtensionContext) {
	maudeSocketExtension.setContext(context);
	maudeSocketExtension.init().catch((error)=> {
		console.log("Failed to activate Ballerina extension. " + (error));
	});
}
export function deactivate() {}
