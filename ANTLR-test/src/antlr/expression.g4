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
    | declList                    # DeclaringListblababab
    | declStatement               # DeclaringReactioObject
    ;

declReaction
    : KEYWORD ID ':' (NUM | ID | expr)        # ReactionInitialization
    | KEYWORD ID                                      # asdfasdfasdf
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
    : '{' ssaList '}' ',' ID
    | ID
    ;

ssaList
    : ssaList ',' ID
    | ID
    ;

expr
    : ID '(' (exprParameters | WS) ')'                      # MethodCall
    | SSA '(' ssaParameters ')'                      # SSACallsdf
    | value exprList                                        # Arithmeticsdf
    ;

exprList
    : REAC expr ('(' expr ')' | WS)      # asdfasdf
    | MULT expr                          # asdfasdfss
    | ADD expr                           # asdfasdfasds
    | WS                                 # asdfasdfasdasd
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
SSA: 'ssa' ;
LIST: 'list' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;