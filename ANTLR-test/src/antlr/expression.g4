grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr )+ EOF                        # Program
    ;
 
decl
    : KEYWORD ID ( ':' reacExpr )?                   # ReacDecl                                 
    | LIST ID ( ':'  '{' reacParams '}' )?           # ListDecl         
    | INT ID ( ':' opExpr )?                         # IntDecl                                  
  //| KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'     # MethodDeclaration
    ;

/*
formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/

assign
    : ID ':' reacExpr                   # ReacAssign
    | ID ':' opExpr                     # IntAssign
    | ID ':' '{' reacParams '}'         # ListAssign
    ;

reacParams
    : reacExpr ',' reacParams                   # ReactionParameters
    | reacExpr                                  # ReactionParameter
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
    | opExpr
    | ifStmt //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

reacExpr
    : opExpr '=>' opExpr '(' opExpr ')'           # ReactionExpressionConst
    | opExpr '=>' opExpr                          # ReactionExpression
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
    : KEYWORD '(' ifConds ')' '{' expr '}' els                  # IfStatement
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

KEYWORD: 'print' | 'while' | 'if' | 'else' ;
INT: 'int' ;
SPECIES: 'species' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
SSA: 'ssa' ;
LIST: 'list' ;
RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;
BOOL: 'true' | 'false' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;