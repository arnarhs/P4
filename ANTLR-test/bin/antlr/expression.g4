grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF
    ;

decl
    : KEYWORD ID ':' expr
    | KEYWORD ID
    | intDecl
    | KEYWORD ID '(' declParameters ')' '{' (decl | expr)+ '}'
    | ssaModelFunctional
    | listDeclarationFunctional
    | ssaModelOO
    | simDecl
    | listDeclarationOO
    ;

expr
    : value exprList
    | reactionExpr
    | parameterExpr
    ;
    
exprList
    : multiplyExpr
    | addExpr 
    | WS
    ;

reactionExpr
    : value reactionExprList
    | value multiplyExpr
    | value addExpr
    | value reactionExprList '(' value ')'
    | (ID | KEYWORD) '(' expr ')'
    ;

reactionExprList
    : reactionOperator reactionExpr
    | reactionOperator value 
    | value
    | WS
    ;

multiplyExpr
    : MULT reactionExpr
    | MULT value
    ;

addExpr
    : ADD reactionExpr
    | ADD value
    ;
    
intDecl: INT ID ':' value
    | INT ID 
    ;
parameterExpr
    : ID '(' exprParameters ')'
    ;

exprParameters
    : value (',' value)*
    | WS
    ;

declParameters
    : KEYWORD ID (',' KEYWORD ID)*
    | WS
    ;

//Functional
//ssaModel({a, b, c}, Rset)
ssaModelFunctional: SSA ssaParameters
    ;
ssaParameters
    : '(''{'ID (',' ID)* '}' ',' ID ')'
    ;

//list<reactions> rSet: {a => b 2, a => c+d 3, c => b 7}
listDeclarationFunctional: declareList '{' listParameters '}'
    ;

declareList: LIST'<'ID'>' ID ':'
    ;
listParameters: reactionExpr (',' reactionExpr)*
    ;

//OO
ssaModelOO: modelDecl ssaParameters
    ;

modelDecl: SSAOO SSA ':'
    ;

simDecl: simulation simulationParameters
    ;
simulation: SIMULATION ID ':'
    ; 
simulationParameters: SSA'.'SIMULATE'('value (',' value)*')'
    ;

listDeclarationOO: declareList simulationParameters
    ;


value
    : NUM
    | ID
    ;

reactionOperator: '=>' | '<=>' | '<=' ;
ADD: '+' ;
MULT: '*' ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' ;
INT: 'int';
SSA: 'ssaModel';
SIMULATION: 'simulation' ;
SIMULATE: 'simulate';
SSAOO: 'ssa';
LIST: 'list' ;
ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;