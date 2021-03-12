grammar expression;

@header {
	package antlr;
}

prog: (decl | expr)+ EOF
	;

decl: KEYWORD ID ':' expr
	| KEYWORD ID '(' parameters ')' '{' (decl | expr)+ '}'		
	;
	
expr: expr '=>' expr '(' value ')'
	| expr '=>' expr
	| expr '+' expr
	| (ID | KEYWORD) '(' expr ')'
	| ID '(' parameters ')'
	| value '*' value
	| value
	;

parameters: parameters ',' parameter
	| parameter
	;
	
parameter: KEYWORD ID
	| value
	;
	
value: NUM
	| id
	;
	
id: KEYWORD
	| ID 
	;
	

KEYWORD : 'species' | 'int' | 'solution' | 'reaction' | 'print';
ID : [a-z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \r\t\n]+ -> skip;