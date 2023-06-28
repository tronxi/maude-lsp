package org.example;

import org.example.antlr4generated.MaudeParser;
import org.example.antlr4generated.MaudeParser.ExtendingContext;
import org.example.antlr4generated.MaudeParser.FmodContext;
import org.example.antlr4generated.MaudeParser.GeneratedByContext;
import org.example.antlr4generated.MaudeParser.IncludingContext;
import org.example.antlr4generated.MaudeParser.ProtectingContext;
import org.example.antlr4generated.MaudeParser.SortContext;
import org.example.antlr4generated.MaudeParserBaseListener;

public class MaudeListener extends MaudeParserBaseListener {

  private final MaudeParser maudeParser;

  public MaudeListener(MaudeParser maudeParser) {
    this.maudeParser = maudeParser;
  }

  @Override
  public void exitFmod(FmodContext ctx) {
    String module = ctx.IDENTIFIER().getText();
    System.out.println("Module name: " + ctx.IDENTIFIER());
  }

  @Override
  public void exitProtecting(ProtectingContext ctx) {
    String module = ctx.PROTECTING().getText();
    System.out.println("Import protecting: " + module.substring(10, module.length() - 1));
  }

  @Override
  public void exitExtending(ExtendingContext ctx) {
    String module = ctx.EXTENDING().getText();
    System.out.println("Import extending: " + module.substring(9, module.length() - 1));
  }

  @Override
  public void exitGeneratedBy(GeneratedByContext ctx) {
    String module = ctx.GENERATED_BY().getText();
    System.out.println("Import generated_by: " + module.substring(12, module.length() - 1));
  }

  @Override
  public void exitIncluding(IncludingContext ctx) {
    String module = ctx.INCLUDING().getText();
    System.out.println("Import including: " + module.substring(9, module.length() - 1));
  }

  @Override
  public void exitSort(SortContext ctx) {
    String sort = ctx.SORT().getText();
    System.out.println("Sort: " + sort.substring(4, sort.length() - 1));
  }


}
