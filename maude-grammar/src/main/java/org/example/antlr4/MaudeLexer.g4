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

IDENTIFIER: ('a'..'z' | 'A'..'Z') ( ('a'..'z' | 'A'..'Z' | '_' | '$' | '0'..'9' ) |
 (BACKQUOTE ESCAPED_CHAR)+ )*;

LT: '<' ;
LCB: '{' ;
RCB: '}' ;
COMMA : ',' ;

DOT: '.';

fragment BACKQUOTE: '`';
fragment ESCAPED_CHAR: '\\{' | '\\}' | '\\(' | '\\)' | '\\[' | '\\]' | '\\,';

WS : [ \t\r\n]+ -> channel(HIDDEN) ;