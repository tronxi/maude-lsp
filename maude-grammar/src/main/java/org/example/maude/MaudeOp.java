package org.example.maude;

import java.util.List;

public class MaudeOp {
  private MaudeToken opName;
  private List<MaudeToken> arityOperators;
  private MaudeToken coarityOperators;
  private MaudeToken attributes;

  public MaudeToken getOpName() {
    return opName;
  }

  public void setOpName(MaudeToken opName) {
    this.opName = opName;
  }

  public List<MaudeToken> getArityOperators() {
    return arityOperators;
  }

  public void setArityOperators(List<MaudeToken> arityOperators) {
    this.arityOperators = arityOperators;
  }

  public MaudeToken getCoarityOperators() {
    return coarityOperators;
  }

  public void setCoarityOperators(MaudeToken coarityOperators) {
    this.coarityOperators = coarityOperators;
  }

  public MaudeToken getAttributes() {
    return attributes;
  }

  public void setAttributes(MaudeToken attributes) {
    this.attributes = attributes;
  }

  @Override
  public String toString() {
    return "Op{" +
        "opName=" + opName +
        ", arity=" + arityOperators +
        ", coarity=" + coarityOperators +
        ", attributes=" + attributes +
        "}\n";
  }
}
