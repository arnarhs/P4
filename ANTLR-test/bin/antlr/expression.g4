grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF
    ;

decl
    : KEYWORD ID ':' expr
    | expr
    | KEYWORD ID
    | KEYWORD ID '(' parameters ')' '{' (decl | expr)+ '}'
    ;

expr
    : value exprList
    | reactionExpr
    | parameterExpr
    ;

parameterExpr
    : ID '(' exprParameters ')'
    ;

exprParameters
    : value (',' value)*
    | value
    ;
	
reactionExpr
    : value reactionExprList
    | value multiplyExpr
    | value addExpr
    | value reactionExprList '(' value ')'
    | (ID|KEYWORD) '(' expr ')'
    ;

reactionExprList
    : reactionOperator reactionExpr
    | reactionOperator value 
    | WS
    ;



exprList
    : multiplyExpr
    | addExpr 
    | WS
    ;

multiplyExpr
    : '*' reactionExpr
    | '*' value
    ;

addExpr
    : '+' reactionExpr
    | '+' value
    ;

parameters
    : KEYWORD ID ',' parameter
    | parameter
    ;
    
parameter
    : KEYWORD ID
    | value
    ;

value
    : NUM
    | ID
    ;

reactionOperator: '=>' | '<=>' | '<=' ;
ADD: "+" ;
MULT: "*" ;

KEYWORD: 'species' | 'int' | 'solution' | 'reaction' | 'print' ;
ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;
