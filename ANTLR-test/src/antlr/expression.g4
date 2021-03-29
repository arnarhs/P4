grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr)+ EOF                 # Program
    ;
 
decl
    : declReaction                         # ReactionDeclaration
    | declInt                              # IntDeclaration
    | declList
    | declStatement                        # DeclaringReactioObject
    ;

declReaction
    : KEYWORD ID ':' (NUM|ID)
    | KEYWORD ID
    ;

declInt
    : INT ID ':' (NUM|ID)
    | INT ID
    ;

//set reactions: {a => b (2), a => c+d (3), c => b (7)}

declList
    : LIST ID ':' '{' listExpr '}'
    | LIST ID 
    ;

declStatement
    : KEYWORD ID '(' declParameters ')' '{' (decl | expr)+ '}'
    : KEYWORD ID '(' ')' '{' (decl | expr)+ '}'
    | WS
    ;

declParameters
    : parameters ',' KEYWORD ID
    | KEYWORD ID
    ;

expr
    | expr mult expr
    | expr add expr
    | ID '(' exprParameters ')'
    | SSA '(' ssaParameters ')'
    | reactionExpr
    | setList
    | value
    ;

reactionExpr
    : value reactionExprList                    # ReactingSpecies
    | value reactionExprList reactionParameter  # ReactionOperatorWithPara
    | (ID | KEYWORD) exprParenthesis            # MethodCall
    | KEYWORD ID ':' expr                       # ReactionInitialization
    | value                                     # NumOrId
    ;

exprParenthesis
    : '(' expr ')'
    ;

reactionExprList
    : reactionOperator reactionExpr
    | reactionOperator reactionExpr
    | WS
    ;

reactionParameter
    : '(' value ')'
    | WS
    ;

exprParameters
    : exprParameters ',' value
    | value
    ;

listExpr
    : value listExprList
    | value multiplyExpr
    | value addExpr
    | value listParameter
    | value
    ;

listExprList
    : reactionOperator listExpr
    ;

listParameter
    : '(' value ')' multiValues
    | '(' value ')'
    ;

multiValues
    : ',' listExpr
    ;

//ssaModel({a, b, c}, reactions)
//ssaModel(reactions)

ssaParameters
    : '{' exprParameters '}' ',' ID
    | ID
    ;

value
    : NUM                                           # Number
    | ID                                            # Variable
    ;

reactionOperator: '=>' | '<=>' | '<=' ;
add: '+' ;
mult: '*' ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' ;
INT: 'int';
SSA: 'ssaModel';
LIST: 'list' ;
ID: [a-z][a-zA-Z0-9_]* ;
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;