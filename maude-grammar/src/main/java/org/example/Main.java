package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.generated.MaudeLexer;
import org.example.generated.MaudeParser;

public class Main {

  public static void main(String[] args) {
    CharStream input = CharStreams.fromString("othername");
    MaudeLexer lexer = new MaudeLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MaudeParser parser = new MaudeParser(tokens);
    ParseTree tree = parser.term();
    ParseTreeWalker walker = new ParseTreeWalker();
    System.out.println(tree.toStringTree(parser));
  }
}