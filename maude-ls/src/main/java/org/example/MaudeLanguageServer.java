package org.example;

import java.util.concurrent.CompletableFuture;
import org.eclipse.lsp4j.ClientCapabilities;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;
import org.eclipse.lsp4j.CompletionOptions;
import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.lsp4j.TextDocumentSyncKind;

public class MaudeLanguageServer implements LanguageServer, LanguageClientAware {

  private final TextDocumentService textDocumentService;
  private final WorkspaceService workspaceService;
  private ClientCapabilities clientCapabilities;
  private LanguageClient languageClient;
  private int shutdown = 1;

  public MaudeLanguageServer() {
    this.textDocumentService = new MaudeTextDocumentService(this);
    this.workspaceService = new MaudeWorkspaceService(this);
  }

  @Override
  public CompletableFuture<InitializeResult> initialize(InitializeParams initializeParams) {
    return CompletableFuture.supplyAsync(() -> {
      this.clientCapabilities = initializeParams.getCapabilities();
      return new InitializeResult(createServerCapabilities());
    });
  }

  private ServerCapabilities createServerCapabilities() {
    ServerCapabilities capabilities = new ServerCapabilities();
    capabilities.setTextDocumentSync(TextDocumentSyncKind.Full);
    capabilities.setCompletionProvider(new CompletionOptions());
    capabilities.setHoverProvider(Boolean.TRUE);
    capabilities.setDeclarationProvider(Boolean.TRUE);
    capabilities.setDefinitionProvider(Boolean.TRUE);
    return capabilities;
  }

  @Override
  public CompletableFuture<Object> shutdown() {
    shutdown = 0;
    return CompletableFuture.supplyAsync(Object::new);
  }

  @Override
  public void exit() {
    System.exit(shutdown);
  }

  @Override
  public TextDocumentService getTextDocumentService() {
    return this.textDocumentService;
  }

  @Override
  public WorkspaceService getWorkspaceService() {
    return this.workspaceService;
  }

  @Override
  public void connect(LanguageClient languageClient) {
    this.languageClient = languageClient;
    LSClientLogger.getInstance().initialize(this.languageClient);
  }
}
