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
    : REACTION ID ( COLON reacExpr )?                  	# ReacDecl                                 
	| LIST ID ( COLON  OPEN_BRAC reacParams CLOSE_BRAC )?        	  	# ListDecl         
    | numDecl                            			 	# NumberDecl
    | BOOLT ID ( COLON pred )?                         	# BoolDecl
	| SOLUTION ID ( COLON OPEN_BRAC declList CLOSE_BRAC )?                 # SolutionDeclaration
    ;

numDecl
	: NUMT ID ( COLON opExpr )?                         
	;


/*
formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/
ssaCall
	: ID DOT SSA OPEN_PAR ID COMMA value CLOSE_PAR					#SsaAlg
	;

reacParams
    : reacExpr COMMA  reacParams                   		# ReactionParameters
    | reacExpr                                  		# ReactionParameter
    ;

declList
	: numDecl COMMA declList								# SpeciesDecls
	| numDecl											# SpeciesDecl
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
    : ssaCall
    | assign
    | reacExpr 
    | opExpr
    | ifStmt
    | whileStmt
    | pred
    
     //methExpr                                      
    //| ID '(' (exprParams | WS*) ')'                   # MethodCall
//| SSA '(' ssaParams ')'                               # GillespieCall
    ;

assign
    : ID COLON reacExpr                   				# ReacAssign
    | ID COLON opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID COLON pred                       				# BoolAssign
    | ID COLON OPEN_BRAC reacParams CLOSE_BRAC         				# ListAssign
    ;

reacExpr
    :   reacPairList RIGHT_ARROW reacPairList OPEN_PAR  opExpr CLOSE_PAR   # ReactionExpression
    ;

reacPairList
	: reacPair ADD reacPairList							# ReactionPairList
	| reacPair											# ReactionPairSingle
	;

reacPair
	: NUM MULT ID   										# ReactionPairMultiplier
	| ID 												# ReactionPair
	;

opExpr
    : OPEN_PAR opExpr CLOSE_PAR						      		# BracketExpression
    | opExpr MULT opExpr                         		# MultiplyExpression 
    | opExpr DIV opExpr   				      			# DivisionExpression
    | opExpr SUB opExpr                         		# SubtractionExpression
    | opExpr ADD opExpr                         		# AdditionExpression
    | value                                       		# NumOrID // hvor er den?
    ;   

whileStmt
	: WHILE OPEN_PAR pred CLOSE_PAR scope  						#WhileStatement
	;
	
ifStmt
    : IF OPEN_PAR pred CLOSE_PAR scope								# IfStatement
    | IF OPEN_PAR pred CLOSE_PAR scope ELSE scope        			# IfElseStatement
    ;

pred
    : OPEN_PAR pred CLOSE_PAR 										# PBracketExpression
    | pred LOGOP pred                                   # LogicalExpr
    | opExpr RELOP opExpr                               # RelationalOperator
    | BOOL												# Boolean
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
BOOL: 'true' | 'false' ;

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