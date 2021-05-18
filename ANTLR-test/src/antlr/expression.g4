grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        		# Program
    ;

scope
    :  '{' ( decl | expr )* '}'                   		# ScopeDecl
    ;

decl 
    : numDecl                            			 	# NumberDecl
    | BOOLT ID ( ':' pred )?                         	# BoolDecl
    | REACTION ID ( ':' reacExpr )?                   	# ReacDecl                                 
	| LIST ID ( ':'  '{' reacParams '}' )?         	  	# ListDecl   
	| SOLUTION ID ( ':' '{' declList '}' )?             # SolutionDeclaration      
    ;

numDecl
	: NUMT ID ( ':' opExpr )?                       
	;

declList
	: numDecl ',' declList								# SpeciesDecls
	| numDecl											# SpeciesDecl
	;

ssaCall
	: SSA '(' ID ',' ID ',' value (',' value)? ')'		#SsaAlg
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
    ;

assign
    : ID ':' reacExpr                   				# ReacAssign
    | ID ':' opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID ':' pred                       				# BoolAssign
    | ID ':' '{' reacParams '}'         				# ListAssign
    | ID ':' '{' declList '}'         				    # SolutionAssign
    ;

reacExpr
    : reacPairList '->' reacPairList '(' opExpr ')'     # ReactionExpression
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




NUMT: 'int' | 'double' | 'species' ;
LIST: 'list' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
SSA: 'ssa' ;

IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;

BOOLT: 'bool' ;
BOOL: 'true' | 'false' | 'random' ;

RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;