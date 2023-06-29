lexer grammar MaudeLexer;

FMOD: 'fmod';

IS: 'is';
ENDFM: 'endfm';

PROTECTING: 'protecting' .*? '.';
EXTENDING: 'extending' .*? '.';
GENERATED_BY: 'generated-by' .*? '.';
INCLUDING: 'including' .*? '.';

SORTS: 'sorts';

SUBSORTS: 'subsorts' ;

OP: 'op' .*? COLON ;

ATTR: LB .*? RB ; //TODO is it necessary to check the value of the attributes at this level?

VARS: 'vars' ;

IDENTIFIER: ('a'..'z' | 'A'..'Z' | '@') ( ('a'..'z' | 'A'..'Z' | '_' | '$' | '@' | '0'..'9' ) |
 (BACKQUOTE ESCAPED_CHAR)+ )*;

LT: '<' ;
LCB: '{' ;
RCB: '}' ;
COMMA : ',' ;
DOT: '.';
ARROW : '->' ;
COLON: ':';

fragment LB : '[';
fragment RB : ']';
fragment BACKQUOTE: '`';
fragment ESCAPED_CHAR: '\\{' | '\\}' | '\\(' | '\\)' | '\\[' | '\\]' | '\\,';

WS : [ \t\r\n]+ -> channel(HIDDEN) ;