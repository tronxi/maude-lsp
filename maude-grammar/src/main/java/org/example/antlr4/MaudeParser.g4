parser grammar MaudeParser;

options { tokenVocab=MaudeLexer; }
condition: ;

strat:  IDLE |
  FAIL |
  ruleApp |
  TOP LP ruleApp RP |
  strat CM strat COLON strat |
  TEST_VARIANT term LSB ST condition RSB |
  strat SEMI_COLOM strat |
  strat PIPE strat |
  MREW_VARIANT term LSB ST condition RSB BY varStratList |
  stratCall |
  strat OR_ELSE strat |
  NOT LP strat RP |
  strat EP |
  TRY LP strat RP |
  TEST LP strat RP ;
  
ruleApp : LABEL_ID LSB LSB substitution RSB RSB LSB LCB strat (COMMA strat)* RCB RSB ;

substitution: VAR_ID SUBSTITUION_SYMBOL term |
  substitution COMMA substitution;

stratCall : STRAT_ID EMPTY_STRAT_CALL|
    STRAT_ID LP term (COMMA term)* RP ;

varStratList : VAR_ID USING strat |
    varStratList COMMA varStratList;

opForm: LP opForm RP |
 opFormPlus ;

opFormPlus: OP_ID |
  OP_ID opFormPlus ;


term: LP term RP |
  termPlus;

termPlus: TOKEN termPlus |
  TOKEN;