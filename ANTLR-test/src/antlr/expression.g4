grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        		# Program
    ;

scope
	:  OPEN_BRAC ( decl | expr )* CLOSE_BRAC            # ScopeDecl
    ;

decl 
    : REACTION ID ( COLON reacExpr )?                  			# ReacDecl                                 
	  | LIST ID ( COLON  OPEN_BRAC reacParams CLOSE_BRAC )?    	# ListDecl         
    | numDecl                            			 	        # NumberDecl
    | BOOLT ID ( COLON pred )?                         			# BoolDecl
	  | SOLUTION ID ( COLON OPEN_BRAC declList CLOSE_BRAC )?   	# SolutionDeclaration
    ;

numDecl
	  : NUMT ID ( COLON opExpr )?                         
	  ;

declList
	: numDecl COMMA declList							# SpeciesDecls
	| numDecl											# SpeciesDecl
	;

ssaCall
	:  SSA OPEN_PAR ID COMMA ID COMMA value (COMMA value)? CLOSE_PAR	#SsaAlg
	;

reacParams
    : reacExpr COMMA  reacParams                   		# ReactionParameters
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
    : ID COLON reacExpr                   				# ReacAssign
    | ID COLON opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID COLON pred                       				# BoolAssign
    | ID COLON OPEN_BRAC reacParams CLOSE_BRAC    		# ListAssign
    | ID COLON OPEN_BRAC declList CLOSE_BRAC      		# SolutionAssign
    ;

reacExpr
    : reacPairList RIGHT_ARROW reacPairList OPEN_PAR opExpr CLOSE_PAR   # ReactionExpression
    ;

reacPairList
	: reacPair ADD reacPairList							# ReactionPairList
	| reacPair											# ReactionPairSingle
	;

reacPair
	: NUM MULT ID   									# ReactionPairMultiplier
	| ID 												# ReactionPair
	;

opExpr
    : OPEN_PAR opExpr CLOSE_PAR						    # BracketExpression
    | opExpr MULT opExpr                         		# MultiplyExpression 
    | opExpr DIV opExpr   				      			# DivisionExpression
    | opExpr SUB opExpr                         		# SubtractionExpression
    | opExpr ADD opExpr                         		# AdditionExpression
    | value                                       		# NumOrID // hvor er den?
    ;   

whileStmt
	: WHILE OPEN_PAR pred CLOSE_PAR scope  				#WhileStatement
	;
	
ifStmt
    : IF OPEN_PAR pred CLOSE_PAR scope (ELSE scope)?	# IfStatement
    ;

pred
    : OPEN_PAR pred CLOSE_PAR 							# PBracketExpression
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

MULT: '*' ;
DIV: '/' ;
SUB: '-' ;
ADD: '+' ;

OPEN_PAR: '(' ;
CLOSE_PAR: ')' ;
OPEN_BRAC: '{' ;
CLOSE_BRAC: '}' ;
RIGHT_ARROW: '->' ;
COLON: ':' ;
COMMA: ',' ;
DOT: '.' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;