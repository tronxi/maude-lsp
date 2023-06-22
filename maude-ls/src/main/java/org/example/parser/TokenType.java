package org.example.parser;

public enum TokenType {
  FMOD("fmod"),
  IS("is"),
  SORTS("sorts"),
  SORT("sort"),
  ARROW("->"),
  OPS("ops"),
  OP("op"),
  EQ("eq"),
  VARS("vars"),
  VAR("var"),
  COLON(":"),
  DOT("\\."),
  LOAD ("load"),
  IDENTIFIER("[a-zA-Z_][a-zA-Z0-9_]*"),
  ATTRIBUTE("\\[(.*?)\\]"),
  EOF(""),
  INVALID("");
  private final String pattern;


  TokenType(String patternRegex) {
    this.pattern = patternRegex;
  }

  public String  getPattern() {
    return pattern;
  }

}