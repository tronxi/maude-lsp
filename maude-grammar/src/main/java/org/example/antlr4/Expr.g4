grammar Expr;

prog:	expr EOF ;

expr:	expr op=('*'|'/') expr # Multi
    |	expr op=('+'|'-') expr # Div
    |	INT #Int
    |	'(' expr ')' #Combo
    ;
NEWLINE : [ \r\n\t]+ -> skip;
INT     : [0-9]+ ;