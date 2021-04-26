grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        	# Program
    ;

scope
    :  '{' ( decl | expr )+ '}'                   	# ScopeDecl
    ;

decl 
    : KEYWORD ID ( ':' reacExpr )?                  # ReacDecl                                 
    | LIST ID ( ':'  '{' reacParams '}' )?          # ListDecl         
    | NUMT ID ( ':' opExpr )?                       # NumberDecl
    | BOOLT ID ( ':' pred )?						# BoolDecl
  //| KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'     # MethodDeclaration
    ;

/*
formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/


reacParams
    : reacExpr ',' reacParams                   	# ReactionParameters
    | reacExpr                                  	# ReactionParameter
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
    | pred
     //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

assign
    : ID ':' reacExpr                   				# ReacAssign
    | ID ':' opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID ':' BOOL                       				# BoolAssign
    | ID ':' '{' reacParams '}'         				# ListAssign
    ;

reacExpr
    : opExpr '->' opExpr '(' opExpr ')'           		# ReactionExpressionConst
    | opExpr '->' opExpr                          		# ReactionExpression
    ;

opExpr
    : '(' opExpr ')'						      		# BracketExpression
    | opExpr '*' opExpr                         		# MultiplyExpression 
    | opExpr '/' opExpr   				      			# DivisionExpression
    | opExpr '-' opExpr                         		# SubtractionExpression
    | opExpr '+' opExpr                         		# AdditionExpression
    | value                                       		# NumOrID // hvor er den?
    ;    

ifStmt
    : KEYWORD '(' pred ')' scope els                  	# IfStatement
    ;

els
    : (elseIfStmt)* elseStmt?
    ;

elseIfStmt
    : KEYWORD KEYWORD '(' pred ')' scope                  # ElseIfStatement
    ;

elseStmt
    : KEYWORD scope                                       # ElseStatement
    ;

pred
    : '(' pred ')' 										  # PBracketExpression
    | pred LOGOP pred                                     # LogicalOperator
    | relExpr                                             # BooleanExpr
    ;

relExpr
    : opExpr RELOP opExpr                                 # RelationalOperator
    | BOOL                                                # Boolean
    ;

value
    : NUM                                        # Number // fix visitor + klasse
    | ID                                         # Variable
    ;


KEYWORD: 'print' | 'while' | 'if' | 'else' ;
NUMT: 'int' | 'double' | 'species' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
SSA: 'ssa' ;
LIST: 'list' ;

BOOLT: 'bool' ;
BOOL: 'true' | 'false' ;

RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;