grammar expression;

@header {
	package: antlr;
}

prog: (decl | expr)+ EOF
	;

decl: KEYWORD ID ':' expr
	| KEYWORD ID '(' parameters ')'		
	;
	
expr: expr '=>' expr '(' value ')'
	| expr '=>' expr
	| expr '+' expr
	| ID '(' expr ')'
	| ID '(' parameters ')'
	| ID
	| value
	;

parameters: parameters ',' parameter
	| parameter
	;
	
parameter: KEYWORD ID
	| value
	;
	
value: NUM
	| ID
	;

KEYWORD : 'Species' | 'Constant' | 'Solution' | 'Reaction' | 'Print';
ID : [a-z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \r\t\n]+ -> skip;