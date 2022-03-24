package modules

import "OLC2/interfaces"

type ModuleCont struct {
	Acceso       interfaces.TipoAccess
	TipoInst     interfaces.TipoAccess
	Instructions interface{}
}

func NewModuleCont(acceso interfaces.TipoAccess, tipoInst interfaces.TipoAccess, instructions interface{}) ModuleCont {
	exp := ModuleCont{acceso, tipoInst, instructions}
	return exp
}
