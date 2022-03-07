lexer grammar RustLex;


// Tokens

// reserved words
//Types
PRINT_CON: 'println!';
T_NUMBER:   'i64';
T_FLOAT:   'f64';
T_STRING:   'String';
T_BOOL:   'bool';
T_STR:   '&str';

//P_IF:       'if';
//P_WHILE:       'while';

TRUE: 'true';
FALSE: 'false';

AS:       'as';

POW:   'pow';
POWF:   'powf';

LET:   'let';
MUT:   'mut';

//functions
TO_STRING:   '.to_string()';
TO_OWNED:   '.to_owned()';


NUMBER: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';
ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

PUNTO:          '.';
COMA:          ',';
PTCOMA:         ';';
DOSPUNTO:         '::';
DPUNTO2:         ':';

ASIGNACION:         '=';

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

//LOGIC
AND:        '&&';
OR:         '||';
NOT:         '!' ;

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

