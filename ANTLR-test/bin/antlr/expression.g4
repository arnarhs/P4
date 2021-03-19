grammar expression;

@header {
    package antlr;
}

prog
    : (decl | expr | func)+ EOF                 # Program
    ;
 
decl
    : declaringReaction                         # ReactionDeclaration
    | declaringInt                              # IntDeclaration
    | KEYWORD ID declParameters                 # DeclaringReactioObject
    ;

expr
    : value exprList
    | reactionExpr
    | parameterExpr
    | setList
    ;

declaringReaction: KEYWORD ID ':' (NUM|ID)
    | KEYWORD ID
    ;

declaringInt: INT ID ':' (NUM|ID)
    | INT ID
    ;

exprList
    : multiplyExpr
    | addExpr 
    | WS
    ;

reactionExpr
    : value reactionExprList                    # ReactingSpecies
    | value multiplyExpr                        # MultiplyExpression
    | value addExpr                             # AddExpression
    | value reactionExprList reactionParameter  # ReactionOperatorWithPara
    | (ID | KEYWORD) exprParenthesis            # MethodCall
    | KEYWORD ID ':' expr                       # ReactionInitialization
    | value                                     # NumOrId
    ;

exprParenthesis: '(' expr ')'
    ;

reactionExprList
    : reactionOperator reactionExpr
    | reactionOperator reactionExpr
    | WS
    ;

reactionParameter: '(' value ')'
    | WS
    ;

multiplyExpr: mult reactionExpr                    
    | mult listExpr                                
    | mult value                                   
    ;

addExpr: add reactionExpr                           
    | add listExpr                                 
    | add value                                    
    ;
    
parameterExpr
    : parameterID paraExpr
    ;

parameterID: ID
    ;

paraExpr: '(' exprParameters ')'
    ;

exprParameters: value valueParameter
    | ',' value valueParameter
    | valueParameter
    | value
    ;

valueParameter: ',' exprParameters
    ;

declParameters: '(' declStatement ')' '{' (decl | expr)+ '}'
    | WS
    ;

declStatement : KEYWORD ID multipleStmt
    | ',' KEYWORD ID multipleStmt
    | KEYWORD ID
    | WS
    ;

multipleStmt: ',' declStatement
    ;

func: runSSA
    ;

//set reactions: {a => b (2), a => c+d (3), c => b (7)}
setList: LIST ID ':' listParameters
    ;

listParameters: '{' listExpr '}'
    ;

listExpr: value listExprList
    | value multiplyExpr
    | value addExpr
    | value listParameter
    | value
    ;

listExprList: reactionOperator listExpr
    ;
listParameter: '(' value ')' multiValues
    | '(' value ')'
    ;
multiValues: ',' listExpr
    ;

//ssaModel({a, b, c}, reactions)
//ssaModel(reactions)

runSSA: SSA ssaMethod
    ;
ssaMethod: '(' ssaParameter')'
    ;
ssaParameter: ssaParameters
    ;
ssaParameters: '{' ssaMethodParameters'}' ',' ID
    | ID
    ;

ssaMethodParameters: value methodParameters
    | value
    ;
methodParameters: ',' ssaMethodParameters 
    ;

value
    : NUM                                           # Number
    | ID                                            # Identification
    ;

reactionOperator: '=>' | '<=>' | '<=' ;
add: '+' ;
mult: '*' ;

KEYWORD: 'species' | 'solution' | 'reaction' | 'print' ;
INT: 'int';
SSA: 'ssaModel';
LIST: 'list' ;
ID: [a-z][a-zA-Z0-9_]* ;									//# Variable
NUM: '0' | '-'?[1-9][0-9]* ;  
COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \r\t\n]+ -> skip ;