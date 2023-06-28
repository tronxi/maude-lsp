lexer grammar MaudeLexer;
TRY: 'try' ;
TEST: 'test' ;
NOT : 'not' ;
OR_ELSE : 'or-else' ;
BY: 'by' ;
ST: 'such that';
IDLE: 'idle' ;
FAIL: 'fail' ;
TOP: 'top' ;

TEST_VARIANT : 'match' |
  'xmatch' |
  'amatch';

MREW_VARIANT: 'matchrew' |
 'xmatchrew' |
  'amatchrew';

FILENAME:  'filename';

DIRECTORY:  'directory';

LS_FLAG:   'ls_flag';

STRING_ID : '"' .*? '"' ;

MOD_ID : [A-Z]+ ;

VIEW_ID : [A-Z][a-zA-Z0-9_]* ;

PARAMETER_ID : [A-Z]+ ;

SORT_ID : [A-Z][a-zA-Z0-9_]* ;

VAR_ID : [A-Z][a-zA-Z0-9_]* ;

VAR_AND_SORT_ID : [a-zA-Z_][a-zA-Z0-9_]* ':' [a-zA-Z_][a-zA-Z0-9_]* ;

OP_ID : [a-zA-Z_][a-zA-Z0-9_]* ;

NAT : [0-9]+ ;

TOKEN:
  BACKQUOTED_TOKEN |
  SYMBOL |
  NON_BACKQUOTED_TOKEN;

LABEL_ID: [a-z][a-zA-Z0-9_]*;

STRAT_ID: [a-z][a-zA-Z0-9_]* ~[@:];

ATTRIBUTE_ID: [a-z][a-zA-Z0-9_]* EXLUDE_TOKENS;
PIPE : '|';
SEMI_COLOM: ';' ;
COLON : ':';
EP : '!';
CM: '?' ;
LCB: '{';
RCB: '}';
LSB: '[';
RSB : ']';

LP : '(' ;
RP : ')' ;
SUBSTITUION_SYMBOL : '<-' ;
EMPTY_STRAT_CALL: '[' LP RP ']';
USING: 'using' ;
COMMA: ',';

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