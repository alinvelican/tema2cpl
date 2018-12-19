lexer grammar CoolLexer;

tokens { ERROR } 



@members{
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

CLASS : 'class';

INHERITS : 'inherits';
NOT:'not';
TIL:'~';
ISVOID:'isvoid';
NEW : 'new';
IF:'if';
THEN :'then';
ELSE:'else';
FI:'fi';
BOOL : 'false' | 'true';
WHILE : 'while';
LOOP :'loop';
POOL:'pool';
LET : 'let';
IN : 'in';
CASE:'case';
ESAC:'esac';
OF:'of';
REZULTA : '=>';
fragment LETTER: [a-zA-Z];
TYPE: [A-Z](LETTER | '_' | DIGIT)*;
ID : (LETTER | '_')(LETTER | '_' | DIGIT)*;
PV:';';
fragment DIGIT : [0-9];
INT : DIGIT+;
AS : '{';
AD:'}';
DP : ':';
PS : '(';
PD : ')';
VIRGULA: ',';
ERROR :  '#'  {raiseError("Invalid character: " + "#");};
STRING : '"' ('\\"' | .)*? '"' { if(getText().length() > 1024) { raiseError("String constant too long"); return;} if (getText().indexOf('\0')>0){ raiseError("String contains null character"); return;}
  } ;

PLUS:'+';
MINUS:'-';
INM:'*';
IMP:'/';
PUNCT : '.';
AT: '@';

ATRIBUIRE : '<-';
COMMENT
    : '--' ~[\r\n]* '\r'? '\n' -> skip
    ;

INEGALITATI : '<='|'>='|'<'|'>';
EGALITATE : '=';
WS
    :   [ \n\f\r\t]+ -> skip
    ;

BLOCK_COMMENT
    : '(*'
      (BLOCK_COMMENT|.)*?
      ('*)' | EOF {System.err.println("EOF in comment");}) -> skip
    ;

        // match integers
NEWLINE:'\r'? '\n' -> skip;  // return newlines to parser (is end-statement signal)
