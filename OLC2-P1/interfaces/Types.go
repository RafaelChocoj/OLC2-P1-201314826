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
)

var nametype = [8]string{
	"i64",
	"f64",
	"String",
	"&str",
	"bool",
	"array",
	"void",
	"NULL",
}

const (
	PUBLIC TipoAccess = iota
	PRIVATE
)

var nameAccesstype = [2]string{
	"pub",
	"private",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}
