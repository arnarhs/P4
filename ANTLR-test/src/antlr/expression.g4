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
    | declStatement                            
    ;

declReaction
    : KEYWORD ID ':' expr          
    | KEYWORD ID                               
    ;

declInt
    : INT ID ':' value
    | INT ID
    ;

declList
    : LIST ID ':' '{' exprParams '}'
    | LIST ID 
    ;

declStatement
    : KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'
    ;

formalParams
    : formalParams ',' KEYWORD ID
    | KEYWORD ID
    ;

exprParams
    : exprParams ',' expr
    | expr
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
    : expr REAC expr (reactionConst | WS*)
    | expr MULT expr                              
    | expr ADD expr     
    | ID '(' (exprParams | WS*) ')'       
    | SSA '(' ssaParams ')'   
    | value               
    ;

reactionConst
    : '(' value ')'
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