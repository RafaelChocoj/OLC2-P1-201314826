package interfaces

type TipoExpresion int
type TipoAccess int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	STR
	BOOLEAN
	ARRAY
	VOID
	NULL
	STRUCT
	BREAK
	CONTINUE
	RETURN
	VECTOR
	CHAR
)

var nametype = [14]string{
	"i64",
	"f64",
	"String",
	"&str",
	"bool",
	"array",
	"void",
	"NULL",
	"struct",
	"break",
	"continue",
	"return",
	"vector",
	"char",
}

const (
	PUBLIC TipoAccess = iota
	PRIVATE
	MOD
	INS
)

var nameAccesstype = [4]string{
	"pub",
	"private",
	"modulo",
	"instruccion",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}
