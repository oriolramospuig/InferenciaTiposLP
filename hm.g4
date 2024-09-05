grammar hm;

root : (def)* expr;

def : (NUM | OPER) ASSIGN tipus             #definicio
    ;

tipus : TIPUSBASIC (FLETXA TIPUSBASIC)*     #tipusCombinat
    ;

expr:
    E expr D                                #parentesis
    | expr expr                             #aplicacio
    | <assoc=right> BARRA ID FLETXA expr    #lambda
    | OPER                                  #operacio
    | ID                                    #id
    | NUM                                   #num
    ;

NUM : [0-9]+ ;
BARRA : '\\' ;
E : '(' ;
D : ')' ;
FLETXA : '->' ;
OPER : ('(+)' | '(-)' | '(*)' | '(/)') ;
ASSIGN : '::' ;
WRITE : 'write' ;
TIPUSBASIC : ('A'..'Z') ;
ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
WS : [ \t\n\r]+ -> skip ;
