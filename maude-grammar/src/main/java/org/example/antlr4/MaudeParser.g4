parser grammar MaudeParser;

options { tokenVocab=MaudeLexer; }

maudeTop: module ;

module: fmod*;

fmod: FMOD IDENTIFIER IS modElt* ENDFM;

modElt: PROTECTING #Protecting |
  EXTENDING #Extending|
  GENERATED_BY #GeneratedBy|
  INCLUDING #Including |
  SORTS sort+ DOT #Sorts |
  SUBSORTS sort+ ( LT sort+)+ DOT #Subsort |
  OP sort* ARROW coarity=sort DOT #Op |
  VARS IDENTIFIER+ COLON type=sort DOT #Vars
 ;

 sort: IDENTIFIER | sort LCB sort (COMMA sort)* RCB ;