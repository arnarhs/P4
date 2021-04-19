grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr )+ EOF                        # Program
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
    | ifStmt //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

valueExpr
    : opExpr '=>' opExpr '(' opExpr ')'           # ReactionExpressionConst
    | opExpr '=>' opExpr                          # ReactionExpression
    | opExpr                                      # OperationExpression
    ;

opExpr
    : '(' opExpr ')'						      # BracketExpression
    | opExpr '*' opExpr                 # MultiplyExpression 
    | opExpr '/' opExpr   				# DivisionExpression
    | opExpr '-' opExpr                 # SubtractionExpression
    | opExpr '+' opExpr                 # AdditionExpression
    | value                                       # NumOrID
    ;       

ifStmt
    : KEYWORD '(' ifConds ')' '{' expr '}' els 					# IfStatement
    ;

els
	: (elseifStmt)* elseStmt?
	;

elseifStmt
    : KEYWORD KEYWORD '(' ifConds ')' '{' expr '}'                 # ElseIfStatement
    ;

elseStmt
    : KEYWORD '{' expr '}'                                         # ElseStatement
    ;

ifConds
    : logicExpr LOGOP ifConds                                       # LogicalOperator
    | logicExpr                                                     # BooleanExpr
    ;

logicExpr
    : BOOL                                                         # Boolean
    | opExpr RELOP opExpr                                          # RelationalOperator
    ;

value
    : NUM                                        # Number
    | ID                                         # Variable
    ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' | 'while' | 'if' | 'else' ;
INT: 'int' ;
SSA: 'ssa' ;
LIST: 'list' ;
RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;
BOOL: 'true' | 'false' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;