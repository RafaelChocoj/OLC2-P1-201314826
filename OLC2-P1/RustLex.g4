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

//sentences
IF:       'if';
ELSE:       'else';
//P_WHILE:       'while';

MATCH:       'match';
MTOR:       '|';

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


PUNTO:          '.';
COMA:          ',';
PTCOMA:         ';';
DOSPUNTO:         '::';
DPUNTO2:         ':';

ASIGNACION:         '=';
MTHEN:         '=>';
GUIONB:         '_';

ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

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
CORIZQ:         '[';
CORDER:         ']';

WHITESPACE: [ \\\r\n\t]+ -> skip;
L_COMMENT : '//' ~[\r\n]* -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

