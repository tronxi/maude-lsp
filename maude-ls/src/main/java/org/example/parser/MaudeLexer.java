package org.example.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaudeLexer {
  private final String input;
  private int relativePosition;
  private int globalPosition;
  private int currentLine;
  private Token currentToken;

  public MaudeLexer(String input) {
    this.input = input;
    this.globalPosition = 0;
    this.relativePosition = 1;
    this.currentLine = 1;
    this.currentToken = null;
  }

  public List<Token> perform() {
    List<Token> tokens = new ArrayList<>();
    Token token;
    do {
      token = getNextToken();
      tokens.add(token);
    }while(!token.type().equals(TokenType.EOF));
    return tokens;
  }

  public Token getNextToken() {
    if (currentToken != null && currentToken.type() == TokenType.EOF) {
      return currentToken;
    }

    skipWhitespaces();

    if (globalPosition >= input.length()) {
      currentToken = createToken(TokenType.EOF, "", currentLine, relativePosition);
      return currentToken;
    }

    Optional<Token> maybeToken = parseSymbol();
    if(maybeToken.isEmpty()) {
      currentToken = createToken(TokenType.INVALID, String.valueOf(input.charAt(globalPosition)), currentLine,
          relativePosition);
      relativePosition += 1;
      globalPosition += 1;
    } else {
      currentToken = maybeToken.get();
    }

    return currentToken;
  }

  private void skipWhitespaces() {
    while (globalPosition < input.length()) {
      char character = input.charAt(globalPosition);
      if(character == '\n') {
        globalPosition++;
        currentLine++;
        relativePosition = 1;
      } else if (character == ' ') {
        relativePosition++;
        globalPosition++;
      } else {
        return;
      }
    }
  }

  private Optional<Token> parseSymbol() {
    for (TokenType tokenType : TokenType.values()) {
      if(!tokenType.getPattern().equals("")){
        Pattern pattern = Pattern.compile(tokenType.getPattern());
        Matcher matcher = pattern.matcher(input.substring(globalPosition));

        if (matcher.find() && matcher.start() == 0) {
          String lexeme = matcher.group();
          Token token = createToken(tokenType, lexeme,currentLine, relativePosition);
          relativePosition += lexeme.length();
          globalPosition += lexeme.length();
          return Optional.of(token);
        }
      }
    }
    return Optional.empty();
  }

  private Token createToken(TokenType type, String lexeme, int line, int startPosition) {
    return new Token(type, lexeme, line, startPosition);
  }
}

