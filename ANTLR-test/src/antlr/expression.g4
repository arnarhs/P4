grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        # Program
    ;

scope
    :  '{' ( decl | expr )+ '}'                   	# ScopeDecl
    ;

decl 
    : REACTION ID ( ':' reacExpr )?                   # ReacDecl                                 
    | LIST ID ( ':'  '{' reacParams '}' )?           # ListDecl         
    | NUMT ID ( ':' opExpr )?                        # NumberDecl
    | BOOLT ID ( ':' BOOL )?                        # BoolDecl
  //| KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'     # MethodDeclaration
    ;

/*
formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/


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
    : assign
    | reacExpr 
    | opExpr
    | ifStmt
     //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

assign
    : ID ':' reacExpr                   # ReacAssign
    | ID ':' opExpr                     # NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID ':' BOOL                       # BoolAssign
    | ID ':' '{' reacParams '}'         # ListAssign
    ;

reacExpr
    : opExpr '->' opExpr '(' opExpr ')'           # ReactionExpressionConst
    | opExpr '->' opExpr                          # ReactionExpression
    ;

opExpr
    : '(' opExpr ')'						      # BracketExpression
    | opExpr '*' opExpr                         # MultiplyExpression 
    | opExpr '/' opExpr   				      # DivisionExpression
    | opExpr '-' opExpr                         # SubtractionExpression
    | opExpr '+' opExpr                         # AdditionExpression
    | value                                       # NumOrID // hvor er den?
    ;    

ifStmt
    : KEYWORD '(' pred ')' scope els                  # IfStatement
    ;

els
    : (elseIfStmt)* elseStmt?
    ;

elseIfStmt
    : KEYWORD KEYWORD '(' pred ')' scope                 # ElseIfStatement
    ;

elseStmt
    : KEYWORD scope                                         # ElseStatement
    ;

pred
    : logicExpr LOGOP pred                                       # LogicalOperator
    | logicExpr                                                     # BooleanExpr
    ;

logicExpr
    : opExpr RELOP opExpr                                           # RelationalOperator
    | ( BOOL | value )                                                # Boolean
    ;

value
    : NUM                                        # Number // fix visitor + klasse
    | ID                                         # Variable
    ;



KEYWORD: 'print' | 'while' | 'if' | 'else' ;
NUMT: 'int' | 'double' | 'species' ;
BOOLT: 'bool' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
SSA: 'ssa' ;
LIST: 'list' ;
RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

BOOL: 'true' | 'false' ;
ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;