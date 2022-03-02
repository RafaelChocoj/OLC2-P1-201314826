package interfaces

type TipoExpresion int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	BOOLEAN
	NULL
)

var nametype = [5]string{
	"i64",
	"f64",
	"String",
	"bool",
	"NULL",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}
