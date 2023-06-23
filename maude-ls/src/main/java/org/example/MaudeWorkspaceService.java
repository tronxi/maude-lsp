package org.example;

import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.RenameFilesParams;
import org.eclipse.lsp4j.services.WorkspaceService;

public class MaudeWorkspaceService implements WorkspaceService {

  private final MaudeLanguageServer maudeLanguageServer;

  private final LSClientLogger clientLogger;

  public MaudeWorkspaceService(MaudeLanguageServer maudeLanguageServer) {
    this.maudeLanguageServer = maudeLanguageServer;
    this.clientLogger = LSClientLogger.getInstance();
  }

  @Override
  public void didChangeConfiguration(DidChangeConfigurationParams didChangeConfigurationParams) {
    this.clientLogger.logMessage(didChangeConfigurationParams.toString());
    this.clientLogger.logMessage("Operation 'workspace/didChangeConfiguration' Ack");
  }

  @Override
  public void didChangeWatchedFiles(DidChangeWatchedFilesParams didChangeWatchedFilesParams) {
    this.clientLogger.logMessage(didChangeWatchedFilesParams.toString());
    this.clientLogger.logMessage("Operation 'workspace/didChangeWatchedFiles' Ack");
  }

  @Override
  public void didRenameFiles(RenameFilesParams params) {
    this.clientLogger.logMessage(params.toString());
    this.clientLogger.logMessage("Operation 'workspace/didRenameFiles' Ack");
  }
}
