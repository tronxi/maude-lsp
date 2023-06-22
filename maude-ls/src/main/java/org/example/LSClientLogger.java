package org.example;
import org.eclipse.lsp4j.MessageParams;
import org.eclipse.lsp4j.MessageType;
import org.eclipse.lsp4j.services.LanguageClient;
public class LSClientLogger {

  private static LSClientLogger INSTANCE;
  private LanguageClient client;
  private boolean isInitialized;

  private LSClientLogger() {
  }

  public void initialize(LanguageClient languageClient) {
    if (!Boolean.TRUE.equals(isInitialized)) {
      this.client = languageClient;
    }
    isInitialized = true;
  }

  public static LSClientLogger getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LSClientLogger();
    }
    return INSTANCE;
  }

  public void logMessage(String message) {
    if (!isInitialized) {
      return;
    }
    client.logMessage(new MessageParams(MessageType.Info, message));
  }

  public void errorMessage(String message) {
    if(!isInitialized) {
      return;
    }
    client.logMessage(new MessageParams(MessageType.Error, message));
  }

  public void showErrorMessage(String message) {
    this.client.showMessage(new MessageParams(MessageType.Error, message));
  }

  public void showInfoMessage(String message) {
    this.client.showMessage(new MessageParams(MessageType.Info, message));
  }

  public void showLogMessage(String message) {
    this.client.showMessage(new MessageParams(MessageType.Warning, message));
  }

}
