package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.antlr4generated.MaudeLexer;
import org.example.antlr4generated.MaudeParser;

public class Main {

  public static void main(String[] args) {
    CharStream input = CharStreams.fromString(getModule());
    MaudeLexer lexer = new MaudeLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MaudeParser parser = new MaudeParser(tokens);
    ParseTree tree = parser.fmod();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new MaudeListener(parser), tree);
  }

  private static String getModule() {
    return """
        fmod BOARD is
            protecting PIECE .
            extending EXTENDING_MODULE_NAME .
            generated-by GENERATED_BY_MODULE_NAME .
            sort Nat .
            including INCLUDING_MODULE_NAME .
            sort Zero .
                

                
        endfm
        """;
  }
}