package interfaces

type StructType struct {
	Id       string
	Tipo     TipoExpresion
	IdStruct string
}

func NewStructType(id string, tipo TipoExpresion, idStruct string) StructType {
	str := StructType{id, tipo, idStruct}
	return str
}
