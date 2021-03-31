grammar expression;

@header {
    package antlr;
}

/*

  TODO:
	- If statements
	- while loops
	- check if valueExpr is ambiguous
	- allow more than two species on either side of reaction

*/

prog
    : (decl | expr)+ EOF                         # Program
    ;
 
decl
    : declReaction                      		# ReactionDeclaration
    | declInt                           		# VariableDeclaration   		 
    | declList                               	# ListDeclaration
    | declMethod                            	# MethodDeclaration
    ;

declReaction
    : KEYWORD ID ':' valueExpr          		
    | KEYWORD ID                               
    ;

declInt
    : INT ID ':' valueExpr
    | INT ID
    ;

declList
    : LIST ID ':' '{' exprParams '}'
    | LIST ID 
    ;

declMethod
    : KEYWORD ID '(' (formalParams | WS*) ')' '{' (decl | expr)* '}'
    ;

formalParams                                   
    : KEYWORD ID ',' formalParams   			# ParamList
    | KEYWORD ID                                # Param
    ;

exprParams
    : valueExpr ',' exprParams 
    | valueExpr
    ;

ssaParams
    : '{' ssaList '}' ',' ID
    | ID
    ;

ssaList
    : ID ',' ssaList  
    | ID
    ;

expr
    : valueExpr   										# ValueExpression
    | ID '(' (exprParams | WS*) ')'       				# MethodCall
    | SSA '(' ssaParams ')'   							# GillespieCall
    ;

valueExpr
    : valueExpr REAC valueExpr (reactionConst | WS*)	# ReactionExpression
    | valueExpr MULT valueExpr                          # MultiplyExpression   
    | valueExpr ADD valueExpr 							# AdditionExpression
    | value 										    # NumOrID
    ;											

reactionConst
    : '(' valueExpr ')'
    ;

value
    : NUM                                        # Number
    | ID                                         # Variable
    ;

REAC: '=>' | '<=>' | '<=' ;
ADD: '+' ;
MULT: '*' ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' ;
INT: 'int' ;
SSA: 'ssa' ;
LIST: 'list' ;

ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> channel(HIDDEN) ;

