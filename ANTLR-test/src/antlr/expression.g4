grammar expression;

@header {
    package antlr;
}

prog
    : ( decl | expr )+ EOF                        	# Program
    ;

scope
    :  OPEN_BRAC ( decl | expr )+ CLOSE_BRAC                   	# ScopeDecl
    ;

decl 
    : KEYWORD ID ( COLON reacExpr )?                   # ReacDecl                                 
    | LIST ID ( COLON  OPEN_BRAC reacParams CLOSE_BRAC )?           # ListDecl         
    | NUMT ID ( COLON opExpr )?                        # NumberDecl
    | BOOLT ID ( COLON pred )?                         # BoolDecl
    | SOLUTION ID ( COLON OPEN_BRAC declList CLOSE_BRAC )?                 # SolutionDeclaration
   // | SOLUTION ID OPEN_PAR ( reacParams | ID COMMA)? CLOSE_PAR OPEN_BRAC (decl | expr)* CLOSE_BRAC     # MethodDeclaration //id for the list
    ;

/*
formalParams                                   
    : KEYWORD ID COMMA formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/


reacParams
    : reacExpr COMMA reacParams                   	# ReactionParameters
    | reacExpr                                  	# ReactionParameter
    ;

declList
	: NUMT ID ( COLON opExpr )? COMMA declList				# SpeciesDecls
	| NUMT ID ( COLON opExpr )?							# SpeciesDecl
	;

/*ssaParams
    : OPEN_BRAC ssaList CLOSE_BRAC COMMA ID
    | ID
    ;
*/
/*ssaList
    : ID COMMA ssaList  
    | ID
    ;*/

expr
    : assign
    | reacExpr 
    | opExpr
    | ifStmt
    | pred
     //methExpr                                      
    //| ID OPEN_PAR (exprParams | WS*) CLOSE_PAR                     # MethodCall
    //| SSA OPEN_PAR ssaParams CLOSE_PAR                             # GillespieCall
    ;

assign
    : ID COLON reacExpr                   				# ReacAssign
    | ID COLON opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID COLON pred                       				# BoolAssign
    | ID COLON OPEN_BRAC reacParams CLOSE_BRAC         				# ListAssign
    ;

reacExpr
    : opExpr RIGHT_ARROW opExpr OPEN_PAR opExpr CLOSE_PAR          		# ReactionExpressionConst
    | opExpr RIGHT_ARROW opExpr                          		# ReactionExpression
    ;

opExpr
    : OPEN_PAR opExpr CLOSE_PAR						      		# BracketExpression
    | opExpr MULT opExpr                         		# MultiplyExpression 
    | opExpr DIV opExpr   				      			# DivisionExpression
    | opExpr SUB opExpr                         		# SubtractionExpression
    | opExpr ADD opExpr                         		# AdditionExpression
    | value                                       		# NumOrID // hvor er den?
    ;    

ifStmt
    : IF OPEN_PAR pred CLOSE_PAR scope								# IfStatement
    | IF OPEN_PAR pred CLOSE_PAR scope ELSE scope        			# IfElseStatement
    ;
// Er else if forsvundet?
pred
    : OPEN_PAR pred CLOSE_PAR 										# PBracketExpression
    | pred LOGOP pred                                   # LogicalOperator
    | relExpr                                           # BooleanExpr
    ;

relExpr
    : opExpr RELOP opExpr                               # RelationalOperator
    | BOOL                                              # Boolean
    ;

value
    : NUM                                        # Number // fix visitor + klasse
    | ID                                         # Variable
    ;


KEYWORD: 'print' | 'while' ;
NUMT: 'int' | 'double' | 'species' ;
REACTION: 'reaction' ; 
SOLUTION: 'solution' ;
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

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;