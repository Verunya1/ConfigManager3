grammar MyLanguage;

//files   :     file files | empty;
//file    :     group student subject;
//group   :    '(' '^' NAME names  ')';
//subject :    '(' title ')';
//student :    '(' '@' info infooo ')';
//title   :     NAME;
//
//FIRST_BRACKET   :   '(';
//LAST_BRACKET    :   ')';
////IGNORE          :   '\t';
////IGNORE_NEWLINE  :   '\n+';
//IGNORE_COMMENT  :   '#.*';
//NAME            :   [^ t#();'@]+;
//STRING          :   [^ :)(t']*;
//DIGIT           :   [0-9]+;
//GROUP           :   '^';
//STUDENT         :   '@';
//WS              :   [ \n\t]+ ->skip;

//INFO    : FIRST_BRACKET (MARK GROUP | DOG STUDENT | SUBJECT ) LAST_BRACKET;

log :  entry+  ;
entry :    (ignore | dog | anchor | subject) ;
subject:OPEN_BRACKET SUBJECT CLOZING_BRACKET CRLF ;
anchor:OPEN_BRACKET ANCHOR  ' ' group CLOZING_BRACKET CRLF ;
dog :OPEN_BRACKET  DOG ' ' student CLOZING_BRACKET CRLF;
student :(AGE ' ' GROUP ' ' STUDENT ' ')+?;
group: (GROUP ' ' )+?;
ignore:IGNORE_COMMENT CRLF;

OPEN_BRACKET   :   '(';
CLOZING_BRACKET :   ')';
fragment DIGIT : [0-9];
 AGE : [0-9]+;
fragment TWO_DIGIT : DIGIT DIGIT;
 ANCHOR:  '^';
 DOG :   '@';
fragment HYPHEN: '-';
fragment POINT: '.';
fragment WHITESPACE: ' ';
fragment QUOTE: '"';
fragment SYMBOL:[\u0400-\u04FF];
//fragment SYMBOL:[a-zA-Z];
CRLF : '\r'? '\n' | '\r';
fragment GROUP_CODE: SYMBOL SYMBOL SYMBOL SYMBOL;
//fragment STRING  :   [^ :)(\t']*;
//fragment NAME   :   [^ \t#();'@]+;
COMMENT  :   '#';


GROUP: GROUP_CODE HYPHEN (DIGIT | TWO_DIGIT) HYPHEN TWO_DIGIT;
STUDENT: SYMBOL+ WHITESPACE SYMBOL POINT SYMBOL POINT;
TEXT: SYMBOL+;
SUBJECT: QUOTE WHITESPACE (TEXT | ' ')+ WHITESPACE QUOTE;
IGNORE_COMMENT: COMMENT (TEXT | ' ')+ ;
//WS:[ \n\t]+ ->skip;

