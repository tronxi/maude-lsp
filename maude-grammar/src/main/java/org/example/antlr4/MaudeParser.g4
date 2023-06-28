parser grammar MaudeParser;

options { tokenVocab=MaudeLexer; }

fmod: FMOD IDENTIFIER IS moduleExpr* ENDFM;

moduleExpr: PROTECTING #Protecting |
  EXTENDING #Extending|
  GENERATED_BY #GeneratedBy|
  INCLUDING #Including |
  SORT #Sort |
//  SORT_WITH_PARAM #SortWithParam |
  SORTS #Sorts |
//  SORTS_WITH_PARAM #SortsWithParam |
  SUBSORTS IDENTIFIER+ ( LT IDENTIFIER+ )+ DOT #Subsorts
  ;