package org.example.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderUtil {
  public static String readFile(String fileUri) throws IOException, URISyntaxException {
    URI uri = new URI(fileUri);
    Path filePath = Paths.get(uri.getPath());
    File file = new File(filePath.toString());
    StringBuilder content = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        content.append(line).append("\n");
      }
    }
    return content.toString();
  }
}
