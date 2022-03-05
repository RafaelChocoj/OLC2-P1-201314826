lexer grammar RustLex;


// Tokens

// reserved words
//Types
PRINT_CON: 'println!';
T_NUMBER:   'i64';
T_FLOAT:   'f64';

T_STRING:   'string';
//P_IF:       'if';
//P_WHILE:       'while';

TRUE: 'true';
FALSE: 'false';

AS:       'as';

POW:   'pow';
POWF:   'powf';

//functions
TO_STRING:   '.to_string()';
TO_OWNED:   '.to_owned()';


NUMBER: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';
//ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

PUNTO:          '.';
COMA:          ',';
PTCOMA:         ';';
DOSPUNTO:         '::';

//RELACIONALES
DISTINTO:      '!=';
IGUAL:          '==';
MAYORIGUAL:     '>=';
MENORIGUAL:     '<=';
MAYOR:          '>';
MENOR:          '<';

//aritment
MUL:            '*';
DIV:            '/';
ADD:            '+';
SUB:            '-';
MOD:            '%';

//signos
AMP:            '&';

PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';

WHITESPACE: [ \\\r\n\t]+ -> skip;
L_COMMENT : '//' ~[\r\n]* -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

