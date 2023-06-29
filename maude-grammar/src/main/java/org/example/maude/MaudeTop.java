package org.example.maude;

import java.util.ArrayList;
import java.util.List;

public class MaudeTop {

  private final List<Fmod> fmodList;


  public MaudeTop() {
    fmodList = new ArrayList<>();
  }

  public void addFmod(Fmod fmod) {
    fmodList.add(fmod);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MaudeTop:\n");
    stringBuilder.append("FMODS:\n\n");
    for(Fmod fmod : fmodList) {
      stringBuilder.append(fmod);
      stringBuilder.append("\n\n");
    }
    return stringBuilder.toString();
  }
}
