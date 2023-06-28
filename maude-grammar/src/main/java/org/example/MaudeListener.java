package org.example;

import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.antlr4generated.MaudeParser;
import org.example.antlr4generated.MaudeParser.ExtendingContext;
import org.example.antlr4generated.MaudeParser.FmodContext;
import org.example.antlr4generated.MaudeParser.GeneratedByContext;
import org.example.antlr4generated.MaudeParser.IncludingContext;
import org.example.antlr4generated.MaudeParser.ProtectingContext;
import org.example.antlr4generated.MaudeParser.SortContext;
//import org.example.antlr4generated.MaudeParser.SortWithParamContext;
import org.example.antlr4generated.MaudeParser.SortsContext;
//import org.example.antlr4generated.MaudeParser.SortsWithParamContext;
import org.example.antlr4generated.MaudeParser.SubsortsContext;
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

//  @Override
//  public void exitSortWithParam(SortWithParamContext ctx) {
//    String sort = ctx.SORT_WITH_PARAM().getText();
//    System.out.println("Sort with param: " + sort.substring(4, sort.length() - 1));
//  }

  @Override
  public void exitSorts(SortsContext ctx) {
    String sort = ctx.SORTS().getText();
    sort = sort.substring(5, sort.length() - 1).trim();
    List<String> sorts = Arrays.stream(sort.split(" ")).toList();
    System.out.println("Sorts: " + sorts);
  }

//  @Override
//  public void exitSortsWithParam(SortsWithParamContext ctx) {
//    String sort = ctx.SORTS_WITH_PARAM().getText();
//    sort = sort.substring(5, sort.length() - 1).trim();
//    List<String> sorts = Arrays.stream(sort.split(" ")).toList();
//    System.out.println("Sorts with param: " + sorts);
//  }


  @Override
  public void exitSubsorts(SubsortsContext ctx) {
    TokenStream tokenStream = maudeParser.getTokenStream();
    for(TerminalNode token : ctx.IDENTIFIER()) {
      System.out.println(token.getPayload());
    }
    for(TerminalNode node: ctx.LT()) {
      System.out.println(node.getPayload());
    }
    System.out.println("Subsorts: " + tokenStream.getText(ctx.getRuleContext()));
  }
}
