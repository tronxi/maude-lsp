package org.example;

import org.antlr.v4.runtime.TokenStream;
import org.example.antlr4.ExprBaseListener;
import org.example.antlr4.ExprParser;
import org.example.antlr4.ExprParser.DivContext;
import org.example.antlr4.ExprParser.MultiContext;

public class ListenerImpl extends ExprBaseListener {
  private ExprParser exprParser;
  public ListenerImpl(ExprParser exprParser) {
    this.exprParser = exprParser;
  }

  @Override
  public void exitMulti(MultiContext ctx) {
    TokenStream tokens = exprParser.getTokenStream();
    System.out.println("multi: " + ctx.getText() + " - " + tokens.getText(ctx.getRuleContext()));
//    String left = ctx.expr(0).getText();
//    String right = ctx.expr(1).getText();
//    String op = ctx.op.getText();
//    System.out.println("MULTI left: " + left + " right: " + right + " op " + op);
  }

  @Override
  public void exitDiv(DivContext ctx) {
    TokenStream tokens = exprParser.getTokenStream();
    System.out.println("div: " + ctx.getText() + " - " + tokens.getText(ctx.getRuleContext()));
//    String left = ctx.expr(0).getText();
//    String right = ctx.expr(1).getText();
//    String op = ctx.op.getText();
//    System.out.println("left: " + left + " right: " + right + " op " + op);
  }


}
