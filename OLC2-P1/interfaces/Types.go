package interfaces

type TipoExpresion int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	STR
	BOOLEAN
	NULL
)

var nametype = [6]string{
	"i64",
	"f64",
	"String",
	"&str",
	"bool",
	"NULL",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}
