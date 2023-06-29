package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.antlr4generated.MaudeLexer;
import org.example.antlr4generated.MaudeParser;
import org.example.maude.MaudeTop;

public class Main {

  public static void main(String[] args) {
    CharStream input = CharStreams.fromString(getModule());
    MaudeLexer lexer = new MaudeLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MaudeParser parser = new MaudeParser(tokens);
    ParseTree tree = parser.maudeTop();
    ParseTreeWalker walker = new ParseTreeWalker();
    MaudeListener maudeListener = new MaudeListener(parser);
    walker.walk(maudeListener, tree);
//    System.out.println(tree.toStringTree(parser));
    MaudeTop maudeTop = maudeListener.getMaudeTop();
    System.out.println(maudeTop);
  }

  private static String getModule() {
    return
"""
fmod BOARD is
protecting PIECE .
extending EXTENDING_MODULE_NAME .
generated-by GENERATED_BY_MODULE_NAME .
including INCLUDING_MODULE_NAME .
including INCLUDING .
sorts Hola WithPar{Par} P{A{B}}.
op name_argumentList_ : Qid @ArgumentList@ -> Function .
endfm
      
fmod OTRO is
protecting Mod .
protecting OtroProtecting .
extending Ext .
sorts Nat P{B} .
subsorts Nat < Otro < P{B} .
subsorts A < B .
op _+_ : Nat Nat -> Nat .
op [_] and then [_] : Command Command -> Command [ctor].
vars M N : Nat .
vars Otra : Nat .

endfm
    """;
  }
}