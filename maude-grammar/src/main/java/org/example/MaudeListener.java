package org.example;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.antlr4generated.MaudeParser;
import org.example.antlr4generated.MaudeParser.ExtendingContext;
import org.example.antlr4generated.MaudeParser.FmodContext;
import org.example.antlr4generated.MaudeParser.GeneratedByContext;
import org.example.antlr4generated.MaudeParser.IncludingContext;
import org.example.antlr4generated.MaudeParser.ProtectingContext;
import org.example.antlr4generated.MaudeParser.SortContext;
import org.example.antlr4generated.MaudeParser.SortsContext;
import org.example.antlr4generated.MaudeParser.SubsortContext;
import org.example.antlr4generated.MaudeParserBaseListener;
import org.example.maude.Fmod;
import org.example.maude.MaudePosition;
import org.example.maude.MaudeRange;
import org.example.maude.MaudeToken;
import org.example.maude.MaudeTop;

public class MaudeListener extends MaudeParserBaseListener {

  private final MaudeTop maudeTop = new MaudeTop();
  private List<MaudeToken> includingList = new ArrayList<>();
  private List<MaudeToken> protectingList = new ArrayList<>();
  private List<MaudeToken> extendingList = new ArrayList<>();
  private List<MaudeToken> generetatedByList = new ArrayList<>();
  private List<MaudeToken> sorts = new ArrayList<>();
  private List<MaudeToken> subsorts = new ArrayList<>();

  private final MaudeParser maudeParser;

  public MaudeListener(MaudeParser maudeParser) {
    this.maudeParser = maudeParser;
  }

  @Override
  public void exitFmod(FmodContext ctx) {
    Fmod fmod = new Fmod();
    MaudeToken name = generateFromTerminalNode(ctx.IDENTIFIER());
    fmod.setName(name);
    fmod.setProtecting(protectingList);
    fmod.setIncluding(includingList);
    fmod.setExtending(extendingList);
    fmod.setGeneratedBy(generetatedByList);
    fmod.setSorts(sorts);
    fmod.setSubsorts(subsorts);
    maudeTop.addFmod(fmod);
    includingList = new ArrayList<>();
    protectingList = new ArrayList<>();
    extendingList = new ArrayList<>();
    generetatedByList = new ArrayList<>();
    sorts = new ArrayList<>();
    subsorts = new ArrayList<>();
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
  public void exitSorts(SortsContext ctx) {
    for(SortContext sortContext : ctx.sort()) {
      TerminalNode sort = sortContext.IDENTIFIER();
      if(sort != null) {
        sorts.add(generateFromTerminalNode(sort));
      }else {
        sorts.add(generateFromContext(sortContext));
      }
    }
  }

  @Override
  public void exitSubsort(SubsortContext ctx) {
    try {
      ParserRuleContext firstElement = (ParserRuleContext) ctx.getChild(1);
      int firstLine = firstElement.getStart().getLine();
      int firstColumn = firstElement.getStart().getCharPositionInLine();
      MaudePosition startPosition = new MaudePosition(firstLine, firstColumn);

      ParserRuleContext lastElement = (ParserRuleContext) ctx.getChild(ctx.getChildCount() - 2);
      int lastLine = lastElement.getStart().getLine();
      int lastColumn = lastElement.getStart().getCharPositionInLine();
      MaudePosition endPosition = new MaudePosition(lastLine, lastColumn + lastElement.getText().length());
      MaudeToken subsort = generateFromContext(ctx, 8, 1, startPosition, endPosition);
      subsorts.add(subsort);
    }catch (Exception ignored) {

    }
  }

  public MaudeTop getMaudeTop() {
    return maudeTop;
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

  private MaudeToken generateFromContext(ParserRuleContext ctx) {
    int startLine = ctx.getStart().getLine();
    int startColumn = ctx.getStart().getCharPositionInLine();
    String token = ctx.getText();
    MaudePosition startPosition = new MaudePosition(startLine, startColumn);
    MaudePosition endPosition = new MaudePosition(startLine, startColumn + token.length());
    return new MaudeToken(token, new MaudeRange(startPosition, endPosition));
  }
  private MaudeToken generateFromContext(ParserRuleContext ctx, int startOffset, int endOffset, MaudePosition startPosition, MaudePosition endPosition) {
    String token = ctx.getText();
    String tokenWithOffset = token.substring(startOffset, token.length() - endOffset);
    return new MaudeToken(tokenWithOffset, new MaudeRange(startPosition, endPosition));
  }
}
