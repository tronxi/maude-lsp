package org.example.maude;

public class Subsort {
  private MaudeToken child;
  private MaudeToken parent;

  public Subsort(MaudeToken child, MaudeToken parent) {
    this.child = child;
    this.parent = parent;
  }

  public MaudeToken getChild() {
    return child;
  }

  public void setChild(MaudeToken child) {
    this.child = child;
  }

  public MaudeToken getParent() {
    return parent;
  }

  public void setParent(MaudeToken parent) {
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "Subsort{child=" + child +"parent=" + parent + "}";
  }
}
