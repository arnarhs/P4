grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        		# Program
    ;

scope
    :  '{' ( decl | expr )+ '}'                   		# ScopeDecl
    ;

decl 
    : REACTION ID ( ':' reacExpr )?                   	# ReacDecl                                 
	| LIST ID ( ':'  '{' reacParams '}' )?         	  	# ListDecl         
    | numDecl                            			 	# NumberDecl
    | BOOLT ID ( ':' pred )?                         	# BoolDecl
	| SOLUTION ID ( ':' '{' declList '}' )?             # SolutionDeclaration
    ;

numDecl
	: NUMT ID ( ':' opExpr )?                       
	;

declList
	: numDecl ',' declList								# SpeciesDecls
	| numDecl											# SpeciesDecl
	;

reacParams
    : reacExpr ',' reacParams                   		# ReactionParameters
    | reacExpr                                  		# ReactionParameter
    ;


expr
    : ssaCall
    | assign
    | reacExpr 
    | opExpr
    | ifStmt
    | whileStmt
    | pred
    | print
    //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                   # MethodCall
    ;
    
ssaCall
	: ID '.' SSA '(' ID ',' value ')'					#SsaAlg
	;

print
	: KEYWORD'('(ID|ssaCall|reacExpr|opExpr|pred)')' # PrintExpr
    ;	

assign
    : ID ':' reacExpr                   				# ReacAssign
    | ID ':' opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID ':' pred                       				# BoolAssign
    | ID ':' '{' reacParams '}'         				# ListAssign
    ;

reacExpr
    :   reacPairList '->' reacPairList '(' opExpr ')'   # ReactionExpression
    ;

reacPairList
	: reacPair '+' reacPairList							# ReactionPairList
	| reacPair											# ReactionPairSingle
	;

reacPair
	: NUM '*' ID   										# ReactionPairMultiplier
	| ID 												# ReactionPair
	;

opExpr
    : '(' opExpr ')'						      		# BracketExpression
    | opExpr '*' opExpr                         		# MultiplyExpression 
    | opExpr '/' opExpr   				      			# DivisionExpression
    | opExpr '-' opExpr                         		# SubtractionExpression
    | opExpr '+' opExpr                         		# AdditionExpression
    | value                                       		# NumOrID
    ;    

whileStmt
	: WHILE '(' pred ')' scope  						#WhileStatement
	;
	
ifStmt
    : IF '(' pred ')' scope	(ELSE scope)?				# IfStatement
    ;

pred
    : '(' pred ')' 										# PBracketExpression
    | pred LOGOP pred                                   # LogicalExpr
    | opExpr RELOP opExpr                               # RelationalOperator
    | BOOL												# Boolean
    | ID												# BooleanVariable
    ;

value
    : NUM                                        		# Number
    | ID                                         		# Variable
    ;




KEYWORD: 'print' ;
NUMT: 'int' | 'double' | 'species' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
WHILE: 'while' ;
SSA: 'ssa' ;
LIST: 'list' ;

IF: 'if' ;
ELSE: 'else' ;

BOOLT: 'bool' ;
BOOL: 'true' | 'false' | 'random' ;

RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;