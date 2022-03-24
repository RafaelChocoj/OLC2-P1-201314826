package instructionExpre

import (
	"OLC2/environment"
	"OLC2/interfaces"
	"OLC2/modules"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type ModuleAccess struct {
	L_idModels *arrayList.List
	Expre      interface{}
	Line       int
	Column     int
}

func NewModuleAccess(l_idmodels *arrayList.List, expre interface{}, line int, column int) ModuleAccess {
	exp := ModuleAccess{l_idmodels, expre, line, column}
	return exp
}

func (p ModuleAccess) EjecutarValor(env interface{}) interfaces.Symbol {

	//var result interfaces.Symbol
	var result interface{}

	l_AccessModelsc := p.L_idModels.Clone()
	id := l_AccessModelsc.GetValue(0).(string)
	//fmt.Println("*** id:", id)
	l_AccessModelsc.RemoveAtIndex(0)

	var tModeAc interfaces.SymbolModule
	tModeAc = env.(environment.Environment).GetModelo(id)

	ent_global := env.(environment.Environment).GetFather(env)
	var mEnvActual environment.Environment
	mEnvActual = environment.NewEnvironment("Module '"+tModeAc.IdMod+"'", ent_global)

	var extraMod interfaces.SymbolModule
	var tmpEnv environment.Environment

	if l_AccessModelsc.Len() > 0 {
		for _, md := range l_AccessModelsc.ToArray() {
			for _, bo := range tModeAc.Body.ToArray() {
				//acceso
				if bo.(modules.ModuleCont).Acceso == interfaces.PUBLIC {
					//instruccion
					if bo.(modules.ModuleCont).TipoInst == interfaces.INS {
						//fmt.Println("0 es instruccion")
						result = bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)

						//fmt.Println("**es fun  bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)** ", reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)))
						if reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)) == reflect.TypeOf(Function{}) {
							//fmt.Println("				chi es instruc entonces guardo- ", bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Id)
							mEnvActual.SaveFuncion(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Id, bo.(modules.ModuleCont).Instructions.(interfaces.Instruction), bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Line, bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Column)
						}
						/*if reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)) == reflect.TypeOf(Struct{}) {
							fmt.Println("11 **es struct ** ")
							//bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)
						}*/

					} else if bo.(modules.ModuleCont).TipoInst == interfaces.MOD {
						//modulo
						if bo.(modules.ModuleCont).Instructions.(modules.Module).IdMod == md.(string) {
							bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)
							extraMod = mEnvActual.GetModelo(md.(string))
							//fmt.Println("	*** md:", md)
							tmpEnv = environment.NewEnvironment("Module '"+extraMod.IdMod+"'", mEnvActual)
						}
					}
					/*} else {
					fmt.Println("funcion o modulo no es publica")*/
				}
			}
			tModeAc = extraMod
			mEnvActual = tmpEnv
		}
	}

	//fmt.Println("result:", result)

	for _, bo := range tModeAc.Body.ToArray() {
		//tipo
		if bo.(modules.ModuleCont).Acceso == interfaces.PUBLIC {
			if bo.(modules.ModuleCont).TipoInst == interfaces.INS {
				//fmt.Println("000 es instruccion")
				result = bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)
				//fmt.Println("**es fun  bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)** ", reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)))

				if reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)) == reflect.TypeOf(Function{}) {
					//fmt.Println("				chi es instruc entonces guardo- ", bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Id)
					mEnvActual.SaveFuncion(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Id, bo.(modules.ModuleCont).Instructions.(interfaces.Instruction), bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Line, bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).(Function).Column)
				}

				/*if reflect.TypeOf(bo.(modules.ModuleCont).Instructions.(interfaces.Instruction)) == reflect.TypeOf(Struct{}) {
					fmt.Println("22 **es struct ** ")
					//bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)
				}*/

			}
			/*} else {
			fmt.Println("2 funcion o modulo no es publica")*/
		}
	}

	//execute expresion
	//fmt.Println("************* hola aqui")
	//fmt.Println("	reflect.TypeOf(p.Expre)", reflect.TypeOf(p.Expre.(interfaces.Expresion)))
	/*if reflect.TypeOf(reflect.TypeOf(p.Expre)) == reflect.TypeOf(interfaces.Instruction) {
		fmt.Println("22 **es struct ** ")
		//bo.(modules.ModuleCont).Instructions.(interfaces.Instruction).Ejecutar(mEnvActual)
	}*/

	//result = p.Expre.(interfaces.Instruction).Ejecutar(mEnvActual)
	result = p.Expre.(interfaces.Expresion).EjecutarValor(mEnvActual)

	//fmt.Println("*******result ", interfaces.GetType(result.(interfaces.Symbol).Tipo))
	//fmt.Println("*******result.(interfaces.Symbol).Capacity ", result.(interfaces.Symbol).Capacity)
	//fmt.Println("***********result.RetObjeto ", result.(interfaces.Symbol).RetObjeto)
	if result != nil {
		if reflect.TypeOf(result) == reflect.TypeOf(interfaces.Symbol{}) {
			if result.(interfaces.Symbol).TipoRet == interfaces.BREAK || result.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || result.(interfaces.Symbol).TipoRet == interfaces.RETURN {

				//fmt.Println("retorno valor modulo", interfaces.GetType(result.(interfaces.Symbol).Tipo))
				return result.(interfaces.Symbol)
			}
		}
	} else {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	//fmt.Println("llego aqui?")
	return result.(interfaces.Symbol)
}

func (p ModuleAccess) Ejecutar(env interface{}) interface{} {
	p.EjecutarValor(env)
	return nil
}
