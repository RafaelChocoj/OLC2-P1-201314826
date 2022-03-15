package interfaces

type TipoExpresion int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	STR
	BOOLEAN
	ARRAY
	NULL
)

var nametype = [7]string{
	"i64",
	"f64",
	"String",
	"&str",
	"bool",
	"array",
	"NULL",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}
