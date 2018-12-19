parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

program:   (classxx PV)+ EOF ;

classxx:   CLASS TYPE (INHERITS TYPE)? AS (featurexx PV)* AD ;
featurexx: ID PS ( formalxx ( VIRGULA formalxx)*)* PD DP TYPE AS expresiexx AD #functie
          | ID DP TYPE (ATRIBUIRE expresiexx)? #atribut ;
formalxx : ID DP TYPE;
expresiexx :
         expresiexx (AT TYPE)? PUNCT ID PS ( expresiexx (VIRGULA expresiexx)*)* PD #objfunccall

        | ID  PS(expresiexx (VIRGULA expresiexx)*)* PD #funccall
        |ifcond ifbody FI #ifthenelse
        | whilehead LOOP expresiexx POOL #whileloop
        | AS (expresiexx PV)+ AD #body
        | LET letbody (VIRGULA letbody)* letcorp   #let
        | CASE expresiexx OF (casebody)+ ESAC #casee
        | NEW TYPE #new
        | ISVOID expresiexx #isvoid
        | expresiexx INM expresiexx #inm
        | expresiexx IMP expresiexx #imp
        | expresiexx PLUS expresiexx #plus
        | expresiexx MINUS expresiexx #minus
        | ID ATRIBUIRE expresiexx #atribuire
        | TIL expresiexx #til
        | expresiexx INEGALITATI expresiexx #ineg
        | expresiexx EGALITATE expresiexx #egal
        | NOT expresiexx #not
        | PS expresiexx PD #paran
        | ID #id
        | INT #intt
        | STRING #string
        | BOOL #bool
         ;
ifbody: ifthen ifelse;
ifthen: THEN expresiexx ;
ifelse: ELSE expresiexx;
ifcond: IF expresiexx;
whilehead: WHILE expresiexx;
letcorp: IN  expresiexx;
letbody: ID DP TYPE (ATRIBUIRE expresiexx)?;
casebody: ID DP TYPE REZULTA expresiexx PV;
