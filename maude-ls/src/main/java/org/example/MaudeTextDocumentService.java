package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.example.parser.FileReaderUtil;
import org.example.parser.MaudeLexer;
import org.example.parser.Token;

public class MaudeTextDocumentService implements TextDocumentService {

  private final MaudeLanguageServer maudeLanguageServer;

  private final LSClientLogger clientLogger;

  public MaudeTextDocumentService(MaudeLanguageServer maudeLanguageServer) {
    this.maudeLanguageServer = maudeLanguageServer;
    this.clientLogger = LSClientLogger.getInstance();
  }


  @Override
  public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {
    perform(didOpenTextDocumentParams.getTextDocument().getUri());
  }

  @Override
  public void didChange(DidChangeTextDocumentParams didChangeTextDocumentParams) {
//    PublishDiagnosticsParams params = new PublishDiagnosticsParams();
//    params.setUri(didChangeTextDocumentParams.getTextDocument().getUri());
//    Diagnostic diagnostic = new Diagnostic();
//    diagnostic.setSeverity(DiagnosticSeverity.Error);
//    diagnostic.setMessage("pasa algooo");
//    diagnostic.setRange(new Range(new Position(0,0), new Position(0,10)));
//    params.setDiagnostics(List.of(diagnostic));
//    maudeLanguageServer.languageClient.publishDiagnostics(params);
    perform(didChangeTextDocumentParams.getTextDocument().getUri());
  }

  private void perform(String uri) {
    try {
      String fileContent = FileReaderUtil.readFile(uri);
      MaudeLexer maudeLexer = new MaudeLexer(fileContent);
      List<Token> tokens = maudeLexer.perform();
      this.clientLogger.logMessage(String.valueOf(tokens.size()));
      for(Token token : tokens) {
        this.clientLogger.logMessage(token.toString());
      }
    } catch (Exception e) {
      this.clientLogger.showErrorMessage(e.getMessage());
    }
  }

  @Override
  public void didClose(DidCloseTextDocumentParams didCloseTextDocumentParams) {
    this.clientLogger.logMessage("Operation '" + "text/didClose" +
        "' {fileUri: '" + didCloseTextDocumentParams.getTextDocument().getUri() + "'} Closed - OK");
  }

  @Override
  public void didSave(DidSaveTextDocumentParams didSaveTextDocumentParams) {
    this.clientLogger.showInfoMessage("guardado");
    this.clientLogger.logMessage("Operation '" + "text/didSave" +
        "' {fileUri: '" + didSaveTextDocumentParams.getTextDocument().getUri() + "'} Saved - OK");
  }

  @Override
  public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(
      CompletionParams position) {
    return CompletableFuture.supplyAsync(() -> {
      this.clientLogger.logMessage("Operation '" + "text/completion");
      CompletionItem completionItem = new CompletionItem();
      completionItem.setLabel("Test completion item");
      completionItem.setInsertText("Algo para poner que sale de aqui");
      completionItem.setDetail("Snippet");
      completionItem.setKind(CompletionItemKind.Snippet);
      return Either.forLeft(List.of(completionItem));
    });
  }

  @Override
  public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> declaration(
      DeclarationParams params) {
    this.clientLogger.logMessage("Operation '" + "text/declaration");
    return CompletableFuture.supplyAsync(() -> {
      try {
        List<Location> declaration = new ArrayList<>();
        Location location = new Location();
        location.setRange(new Range(new Position(0,0), new Position(0,10)));
        declaration.add(new Location());
        return Either.forLeft(declaration);
      } catch (Throwable e) {
        return null;
      }
    });
  }

}
