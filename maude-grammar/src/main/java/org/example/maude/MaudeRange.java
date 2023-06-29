package org.example.maude;

public class MaudeRange {
  private MaudePosition start;
  private MaudePosition end;

  public MaudeRange(MaudePosition start, MaudePosition end) {
    this.start = start;
    this.end = end;
  }

  public MaudePosition getStart() {
    return start;
  }

  public void setStart(MaudePosition start) {
    this.start = start;
  }

  public MaudePosition getEnd() {
    return end;
  }

  public void setEnd(MaudePosition end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return "{" +
        "start=" + start +
        ", end=" + end +
        '}';
  }
}
