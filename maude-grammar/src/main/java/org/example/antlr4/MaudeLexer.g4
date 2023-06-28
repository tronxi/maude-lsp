lexer grammar MaudeLexer;

FMOD: 'fmod';

IS: 'is';
ENDFM: 'endfm';

PROTECTING: 'protecting' .*? '.';
EXTENDING: 'extending' .*? '.';
GENERATED_BY: 'generated-by' .*? '.';
INCLUDING: 'including' .*? '.';

//SORTS_WITH_PARAM: 'sort' (.*? '{' .*? (',' .*?)+ '}' '.')+;
SORTS: 'sorts' .*? '.';
//TODO use identifier in sort and sorts rule
//SORT_WITH_PARAM: 'sort' .*?'{' .*? (',' .*?)+ '}' '.';
SORT: 'sort' .*? '.';

SUBSORTS: 'subsorts' ;

LT: '<' ;

IDENTIFIER: ('a'..'z' | 'A'..'Z') ( ('a'..'z' | 'A'..'Z' | '_' | '$' | '0'..'9' ) |
 (BACKQUOTE ESCAPED_CHAR)+ )*;

DOT: '.';

fragment BACKQUOTE: '`';
fragment ESCAPED_CHAR: '\\{' | '\\}' | '\\(' | '\\)' | '\\[' | '\\]' | '\\,';

WS : [ \t\r\n]+ -> channel(HIDDEN) ;