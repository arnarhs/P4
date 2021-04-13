grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF                        # Program
    ;
 
decl
    : declReaction                              
    | declInt                                               
    | declList                                  
  //| declMethod                                # MethodDeclaration
    ;

declReaction
    : KEYWORD ID ':' reacExpr                   # ReacDeclAssignment                  
    | KEYWORD ID                                # ReacDecl
    ;

declInt
    : INT ID ':' basicExpr                      # IntDeclAssignment
    | INT ID                                    # IntDecl
    ;

declList
    : LIST ID ':' '{' reacParams '}'            #ListDeclParams
    | LIST ID                                   #ListDecl
    ;


/*
declMethod
    : KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'
    ;

formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/
reacParams
    : reacExpr ',' reacParams 
    | reacExpr
    ;

/*ssaParams
    : '{' ssaList '}' ',' ID
    | ID
    ;
*/
/*ssaList
    : ID ',' ssaList  
    | ID
    ;*/

expr
    : reacExpr
    | basicExpr                                        
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

reacExpr
    : basicExpr REAC basicExpr '(' basicExpr ')'        # ReactionExpressionConst
    | basicExpr REAC basicExpr                          # ReactionExpression
    ;

basicExpr
    : basicExpr MULT basicExpr                    # MultiplyExpression   
    | basicExpr ADD basicExpr                     # AdditionExpression
    | value                                       # NumOrID
    ;    

value
    : NUM                                        # Number
    | ID                                         # Variable
    ;

REAC: '=>' ;
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