lexer grammar RustLex;


// Tokens

//CONSOLE:  'console';
//LOG:      'log';
PRINT_CON: 'println!';
T_NUMBER:   'i64';
T_FLOAT:   'f64';

T_STRING:   'string';
//P_IF:       'if';
//P_WHILE:       'while';

TRUE: 'true';
FALSE: 'false';

AS:       'as';

NUMBER: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';
//ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

PUNTO:          '.';
PTCOMA:         ';';

//DIFERENTE:      '!';
IGUAL:          '=';
MAYORIGUAL:     '>=';
MENORIGUAL:     '<=';
MAYOR:          '>';
MENOR:          '<';

MUL:            '*';
DIV:            '/';
ADD:            '+';
SUB:            '-';
MOD:            '%';

PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';


WHITESPACE: [ \\\r\n\t]+ -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

