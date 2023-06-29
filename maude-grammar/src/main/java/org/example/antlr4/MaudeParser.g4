parser grammar MaudeParser;

options { tokenVocab=MaudeLexer; }

fmod: FMOD IDENTIFIER IS modElt* ENDFM;

modElt: PROTECTING #Protecting |
  EXTENDING #Extending|
  GENERATED_BY #GeneratedBy|
  INCLUDING #Including |
  SORTS sort+ DOT #Sorts
  ;

 sort: IDENTIFIER | sort LCB sort (COMMA sort)* RCB ;