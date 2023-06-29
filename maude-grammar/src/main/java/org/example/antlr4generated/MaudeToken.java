package org.example.antlr4generated;

import org.example.maude.MaudeRange;

public class MaudeToken {
  String token;
  MaudeRange maudeRange;

  public MaudeToken(String token, MaudeRange maudeRange) {
    this.token = token;
    this.maudeRange = maudeRange;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public MaudeRange getMaudeRange() {
    return maudeRange;
  }

  public void setMaudeRange(MaudeRange maudeRange) {
    this.maudeRange = maudeRange;
  }

  @Override
  public String toString() {
    return "Tkn{"+token+ " " + maudeRange +"}";
  }
}
