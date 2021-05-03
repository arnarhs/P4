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
    : REACTION ID ( ':' reacExpr )?                   # ReacDecl                                 
    | LIST ID ( ':'  '{' reacParams '}' )?           # ListDecl         
    | numDecl                            			 # NumberDecl
    | BOOLT ID ( ':' pred )?                         # BoolDecl
    | SOLUTION ID ( ':' '{' declList '}' )?                 # SolutionDeclaration
    ;

numDecl
	: NUMT ID ( ':' opExpr )?                       
	;


/*
formalParams                                   
    : KEYWORD ID ',' formalParams               //# ParamList
    | KEYWORD ID                                //# Param
    ;
*/
ssaCall
	: ID '.' SSA '(' ID ',' value ')'			#SsaAlg
	;

reacParams
    : reacExpr ',' reacParams                   	# ReactionParameters
    | reacExpr                                  	# ReactionParameter
    ;

declList
	: numDecl ',' declList				# SpeciesDecls
	| numDecl							# SpeciesDecl
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
    //| ID '(' (exprParams | WS*) ')'                     # MethodCall
    //| SSA '(' ssaParams ')'                             # GillespieCall
    ;

assign
    : ID ':' reacExpr                   				# ReacAssign
    | ID ':' opExpr                     				# NumberAssign  // Kan vi samle den her med float og m?ke bool?
    | ID ':' pred                       				# BoolAssign
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

whileStmt
	: WHILE '(' pred ')' scope  			#WhileStatement
	;
	
ifStmt
    : IF '(' pred ')' scope								# IfStatement
    | IF '(' pred ')' scope ELSE scope        			# IfElseStatement
    ;

pred
    : '(' pred ')' 										# PBracketExpression
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
WHILE: 'while' ;
SSA: 'ssa' ;
LIST: 'list' ;

IF: 'if' ;
ELSE: 'else' ;

BOOLT: 'bool' ;
BOOL: 'true' | 'false' ;

RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=' ;
LOGOP: '||' | '&&' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '-'?([0-9]+)('.'[0-9]+)?;
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;