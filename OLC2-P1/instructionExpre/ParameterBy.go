package instructionExpre

type ParameterBy struct {
	Expre interface{}
	IsRef bool
}

func NewParameterBy(expre interface{}, isRef bool) ParameterBy {
	exp := ParameterBy{Expre: expre, IsRef: isRef}
	return exp
}
