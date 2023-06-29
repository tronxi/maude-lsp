package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import org.example.maude.Fmod;
import org.example.maude.MaudePosition;
import org.example.maude.MaudeRange;
import org.example.maude.MaudeToken;

public class MaudeListener extends MaudeParserBaseListener {

  private Fmod fmod;
  List<MaudeToken> includingList = new ArrayList<>();
  List<MaudeToken> protectingList = new ArrayList<>();
  List<MaudeToken> extendingList = new ArrayList<>();
  List<MaudeToken> generetatedByList = new ArrayList<>();

  private final MaudeParser maudeParser;

  public MaudeListener(MaudeParser maudeParser) {
    this.maudeParser = maudeParser;
  }

  @Override
  public void exitFmod(FmodContext ctx) {
    fmod = new Fmod();
    MaudeToken name = generateFromTerminalNode(ctx.IDENTIFIER());
    fmod.setName(name);
    fmod.setProtecting(protectingList);
    fmod.setIncluding(includingList);
    fmod.setExtending(extendingList);
    fmod.setGeneratedBy(generetatedByList);
  }


  @Override
  public void exitProtecting(ProtectingContext ctx) {
    MaudeToken protecting = generateFromTerminalNode(ctx.PROTECTING(), 10, 1);
    protectingList.add(protecting);
  }

  @Override
  public void exitExtending(ExtendingContext ctx) {
    MaudeToken extending = generateFromTerminalNode(ctx.EXTENDING(), 9, 1);
    extendingList.add(extending);
  }

  @Override
  public void exitGeneratedBy(GeneratedByContext ctx) {
    MaudeToken generatedBy = generateFromTerminalNode(ctx.GENERATED_BY(), 12, 1);
    generetatedByList.add(generatedBy);
  }

  @Override
  public void exitIncluding(IncludingContext ctx) {
    MaudeToken including = generateFromTerminalNode(ctx.INCLUDING(), 9, 1);
    includingList.add(including);
  }

  @Override
  public void exitSort(SortContext ctx) {
    String sort = ctx.SORT().getText();
//    System.out.println("Sort: " + sort.substring(4, sort.length() - 1));
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
//    System.out.println("Sorts: " + sorts);
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
//      System.out.println(token.getPayload());
    }
    for(TerminalNode node: ctx.LT()) {
//      System.out.println(node.getPayload());
    }
//    System.out.println("Subsorts: " + tokenStream.getText(ctx.getRuleContext()));
  }

  public Fmod getFmod() {
    return fmod;
  }

  private MaudeToken generateFromTerminalNode(TerminalNode terminalNode) {
    int startLine = terminalNode.getSymbol().getLine();
    int startColumn =  terminalNode.getSymbol().getCharPositionInLine();
    String token = terminalNode.getText();
    MaudePosition startPosition = new MaudePosition(startLine, startColumn);
    MaudePosition endPosition = new MaudePosition(startLine, startColumn + token.length());
    return new MaudeToken(token, new MaudeRange(startPosition, endPosition));
  }
  private MaudeToken generateFromTerminalNode(TerminalNode terminalNode, int startOffset, int endOffset) {
    int startLine = terminalNode.getSymbol().getLine();
    int startColumn =  terminalNode.getSymbol().getCharPositionInLine() + startOffset;
    String token = terminalNode.getText();
    String tokenWithOffset = token.substring(startOffset, token.length() - endOffset);
    MaudePosition startPosition = new MaudePosition(startLine, startColumn);
    MaudePosition endPosition = new MaudePosition(startLine, startColumn + tokenWithOffset.length() - endOffset);
    return new MaudeToken(tokenWithOffset, new MaudeRange(startPosition, endPosition));
  }
}
