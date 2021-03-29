grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF          # Program
    ;
 
decl
    : declReaction                # ReactionDeclaration
    | declInt                     # IntDeclaration
    | declList
    | declStatement               # DeclaringReactioObject
    ;

declReaction
    : KEYWORD ID ':' (NUM | ID | reactionExpr)        # ReactionInitialization
    | KEYWORD ID
    ;

declInt
    : INT ID ':' (NUM | ID)
    | INT ID
    ;

declList
    : LIST ID ':' '{' exprParameters '}'
    | LIST ID 
    ;

declStatement
    : KEYWORD ID '(' (formalParameters | WS) ')' '{' (decl | expr)+ '}'
    ;

formalParameters
    : formalParameters ',' KEYWORD ID
    | KEYWORD ID
    ;

exprParameters
    : exprParameters ',' expr
    | expr
    ;

ssaParameters
    : ssaParameters ',' ID
    | ID
    ;

expr
    : ID '(' (exprParameters | WS) ')'           # MethodCall
    | SSA '(' ('{' ssaParameters '}' ',' | WS) ID ')'
    | value exprList
    | reactionExpr
    ;

exprList
    : MULT expr 
    | ADD expr 
    | WS
    ;

reactionExpr
    : expr REAC expr ('(' value ')' | WS)      # ReactingSpecies
    ;

value
    : NUM                   # Number
    | ID                    # Variable
    ;

REAC: '=>' | '<=>' | '<=' ;
ADD: '+' ;
MULT: '*' ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' ;
INT: 'int' ;
SSA: 'ssaModel' ;
LIST: 'list' ;
ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;