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
T_CHAT:   'char';
T_ARRAY:   'array';
T_VECTOR:   'Vector';
USIZE: 'usize';

//sentences
IF:       'if';
ELSE:       'else';
WHILE:  'while';
LOOP:   'loop';
FOR:    'for';
IN:     'in';

BREAK: 'break';
CONTINUE: 'continue';

MATCH:       'match';
MTOR:       '|';

TRUE: 'true';
FALSE: 'false';

AS:       'as';

POW:   'pow';
POWF:   'powf';

LET:   'let';
MUT:   'mut';

STRUCT:  'struct';
VEC:     'vec!';
VECN:     'Vec';
CAPACITY:     'with_capacity';

//functions
TO_STRING:   '.to_string()';
TO_OWNED:   '.to_owned()';

LEN:        'len()';
NEW:        'new()';
CAPF:       'capacity()';
CLONE:      'clone()';
ABS:        'abs()';
SQRT:       'sqrt()';
PUSH:       'push';
CONTAINS:   'contains';

INSERT:     'insert';
REMOVE:     'remove';

MODULO:        'mod';

//funciones
PUBLIC:     'pub';
TYPETHEN:      '->';

FN:     'fn';
MAIN:   'main';
RETURN: 'return';

//REF: '&mut';


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

CHAR: ['][a-zA-Z0-9]['];

WHITESPACE: [ \\\r\n\t]+ -> skip;
L_COMMENT : '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

