package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;

public class MaudeServerLanguageLauncher {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    if(args.length == 0) {
      startServerStd(System.in, System.out);
    } else if (args[0].equals("std")) {
      startServerStd(System.in, System.out);
    } else if(args[0].equals("socket")) {
      try {
        Socket clientSocket = new Socket("127.0.0.1", 9925);
        startServerSocket(clientSocket.getInputStream(), clientSocket.getOutputStream());
      } catch (IOException | InterruptedException | ExecutionException e) {
        // Failed to start the server
      }
    }
  }

  public static void startServerStd(InputStream in, OutputStream out) throws InterruptedException, ExecutionException {
    MaudeLanguageServer server = new MaudeLanguageServer();
    Launcher<LanguageClient> launcher = Launcher.createLauncher(server, LanguageClient.class, in, out);
    LanguageClient client = launcher.getRemoteProxy();
    server.connect(client);
    Future<?> startListening = launcher.startListening();
    startListening.get();
  }

  public static void startServerSocket(InputStream in, OutputStream out)
      throws InterruptedException, ExecutionException {
    MaudeLanguageServer server = new MaudeLanguageServer();
    Launcher<LanguageClient> launcher = LSPLauncher.createServerLauncher(server, in, out);
    server.connect(launcher.getRemoteProxy());
    Future<?> startListening = launcher.startListening();
    startListening.get();
  }
}