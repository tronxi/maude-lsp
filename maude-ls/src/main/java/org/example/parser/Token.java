package org.example.parser;

public record Token(TokenType type, String lexeme, int line, int startPosition) {

  @Override
  public String toString() {
    return "Token{" +
        "type=" + type +
        ", lexeme='" + lexeme + '\'' +
        ", line=" + line +
        ", startPosition=" + startPosition +
        '}';
  }
}
