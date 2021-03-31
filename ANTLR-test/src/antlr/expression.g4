grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF                         # Program
    ;
 
decl
    : declReaction                      
    | declInt                             
    | declList                               
    | declMethod                            
    ;

declReaction
    : KEYWORD ID ':' valueExpr          
    | KEYWORD ID                               
    ;

declInt
    : INT ID ':' valueExpr
    | INT ID
    ;

declList
    : LIST ID ':' '{' exprParams '}'
    | LIST ID 
    ;

declMethod
    : KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'
    ;

formalParams
    : formalParams ',' KEYWORD ID
    | KEYWORD ID
    ;

exprParams
    : exprParams ',' valueExpr
    | valueExpr
    ;

ssaParams
    : '{' ssaList '}' ',' ID
    | ID
    ;

ssaList
    : ssaList ',' ID
    | ID
    ;

expr
    : valueExpr   
    | ID '(' (exprParams | WS*) ')'       
    | SSA '(' ssaParams ')'   
    ;

valueExpr
    : valueExpr REAC valueExpr (reactionConst | WS*)
    | valueExpr MULT valueExpr                              
    | valueExpr ADD valueExpr 
    | value;

reactionConst
    : '(' valueExpr ')'
    ;

value
    : NUM                                        # Number
    | ID                                         # Variable
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
WS: [ \r\t\n]+ -> channel(HIDDEN) ;