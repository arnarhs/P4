grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        # Program
    ;

scope
    : '{' ( decl | expr )+ '}'                    # scope

decl
    : KEYWORD ID ( ':' reacExpr )?                   # ReacDecl                                 
    | LIST ID ( ':'  '{' reacParams '}' )?           # ListDecl         
    | INT ID ( ':' opExpr )?                         # IntDecl
    | DOUBLE ID ( ':' opExpr )?                       # DoubleDecl
    | BOOL ID ( ':' BOOLT )?                        # BoolDecl
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
    | ID ':' opExpr                     # IntAssign  // Kan vi samle den her med float og måske bool?
    | ID ':' BOOLT                      # BoolAssign
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
    : opExpr '->' opExpr '(' opExpr ')'           # ReactionExpressionConst
    | opExpr '->' opExpr                          # ReactionExpression
    ;

opExpr
    : '(' opExpr ')'						      # BracketExpression
    | opExpr '*' opExpr                 # MultiplyExpression 
    | opExpr '/' opExpr   				# DivisionExpression
    | opExpr '-' opExpr                 # SubtractionExpression
    | opExpr '+' opExpr                 # AdditionExpression
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
    | ( BOOLT | value )                                                # Boolean
    ;

value
    : INUM                                        # Integer // fix visitor + klasse
    | ID                                         # Variable
    | DNUM                                       # Double
    ;



KEYWORD: 'print' | 'while' | 'if' | 'else' ;
INT: 'int' ;                                      // kunne vi samle den her med float og måske bool?
DOUBLE: 'double' ;
BOOL: 'bool' ;
SPECIES: 'species' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
SSA: 'ssa' ;
LIST: 'list' ;
RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

BOOLT: 'true' | 'false' ;
ID: [a-z][a-zA-Z0-9_]* ;
INUM: '0' | '-'?[1-9][0-9]* ;
DNUM: '-'?('0'|[1-9][0-9]*)'.'[0-9]*[1-9];
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;