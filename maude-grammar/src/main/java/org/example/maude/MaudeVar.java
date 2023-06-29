package org.example.maude;

public class MaudeVar {
  private MaudeToken var;
  private MaudeToken type;

  public MaudeToken getVar() {
    return var;
  }

  public void setVar(MaudeToken var) {
    this.var = var;
  }

  public MaudeToken getType() {
    return type;
  }

  public void setType(MaudeToken type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Var{" +
        "var=" + var +
        ", type=" + type +
        '}';
  }
}
