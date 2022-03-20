package interfaces

type StructType struct {
	Id   string
	Tipo TipoExpresion
}

func NewStructType(id string, tipo TipoExpresion) StructType {
	str := StructType{id, tipo}
	return str
}
