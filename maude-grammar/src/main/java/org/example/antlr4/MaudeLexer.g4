lexer grammar MaudeLexer;

TOKEN:
  BACKQUOTED_TOKEN |
  SYMBOL |
  NON_BACKQUOTED_TOKEN;
LABEL_ID: [a-z][a-zA-Z0-9_]*;
STRAT_ID: [a-z][a-zA-Z0-9_]* ~[@:];
ATTRIBUTE_ID: [a-z][a-zA-Z0-9_]* EXLUDE_TOKENS;
LP : '(' ;
RP : ')' ;
fragment NON_BACKQUOTED_TOKEN: ~[\r\n()[\]{}`,]+ ;

fragment SYMBOL :
  '(' |
  ')' |
  '[' |
  ']' |
  '{' |
  '}' |
  ',';

fragment BACKQUOTED_TOKEN: '`' ~[\r\n]+ '`';

fragment EXLUDE_TOKENS:
  ~',' |
  ~'[' |
  ~']' |
  ~'{' |
  ~'}' |
  ~',' ;