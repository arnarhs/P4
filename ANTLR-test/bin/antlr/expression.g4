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
    //| declList                                  # ListDeclaration
    //| declMethod                                # MethodDeclaration
    ;

declReaction
    : KEYWORD ID ':' valueExpr                  # ReacDeclAssignment                  
    | KEYWORD ID                                # ReacDecl
    ;

declInt
    : INT ID ':' valueExpr                      # IntDeclAssignment
    | INT ID                                    # IntDecl
    ;

/*declList
    : LIST ID ':' '{' exprParams '}'
    | LIST ID 
    ;

declMethod
    : KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'
    ;

formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/
/*exprParams
    : valueExpr ',' exprParams 
    | valueExpr
    ;
*/
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
    : valueExpr                                        
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

valueExpr
    : opExpr REAC opExpr '(' opExpr ')'           # ReactionExpressionConst
    | opExpr REAC opExpr                          # ReactionExpression
    | opExpr                                      # OperationExpression
    ;

opExpr
    : opExpr MULT opExpr                          # MultiplyExpression   
    | opExpr ADD opExpr                           # AdditionExpression
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