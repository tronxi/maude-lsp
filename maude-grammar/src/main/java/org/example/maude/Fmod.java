package org.example.maude;

import java.util.List;

public class Fmod {
  private MaudeToken name;
  private List<MaudeToken> including;
  private List<MaudeToken> protecting;
  private List<MaudeToken> extending;
  private List<MaudeToken> generatedBy;
  private List<MaudeToken> sorts;
  private List<MaudeToken> subsorts;
  private List<MaudeOp> operators;
  private List<MaudeVar> vars;

  @Override
  public String toString() {
    return "Fmod{\n" +
        "name='" + name + '\'' +
        "\n including=" + including +
        "\n extending=" + extending +
        "\n protecting=" + protecting +
        "\n generated-by=" + generatedBy +
        "\n sorts=" + sorts +
        "\n subsorts=" + subsorts +
        "\n operators=" + operators +
        "\n vars=" + vars +
        "\n}";
  }

  public MaudeToken getName() {
    return name;
  }

  public void setName(MaudeToken name) {
    this.name = name;
  }

  public List<MaudeToken> getIncluding() {
    return including;
  }

  public void setIncluding(List<MaudeToken> including) {
    this.including = including;
  }

  public List<MaudeToken> getProtecting() {
    return protecting;
  }

  public void setProtecting(List<MaudeToken> protecting) {
    this.protecting = protecting;
  }

  public List<MaudeToken> getExtending() {
    return extending;
  }

  public void setExtending(List<MaudeToken> extending) {
    this.extending = extending;
  }

  public List<MaudeToken> getGeneratedBy() {
    return generatedBy;
  }

  public void setGeneratedBy(List<MaudeToken> generatedBy) {
    this.generatedBy = generatedBy;
  }

  public List<MaudeToken> getSorts() {
    return sorts;
  }

  public void setSorts(List<MaudeToken> sorts) {
    this.sorts = sorts;
  }

  public List<MaudeToken> getSubsorts() {
    return subsorts;
  }

  public void setSubsorts(List<MaudeToken> subsorts) {
    this.subsorts = subsorts;
  }

  public List<MaudeOp> getOperators() {
    return operators;
  }

  public void setOperators(List<MaudeOp> operators) {
    this.operators = operators;
  }

  public List<MaudeVar> getVars() {
    return vars;
  }

  public void setVars(List<MaudeVar> vars) {
    this.vars = vars;
  }
}
