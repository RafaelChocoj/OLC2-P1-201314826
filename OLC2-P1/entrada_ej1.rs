// Ejemplo de módulo simple
mod Cine{
    pub fn direccion() -> String {
        return "6ta calle 4-67, avenida cuadro".to_string();
    }
    fn empleados() -> i64 {
        return 23;
    }
}
//Ejemplo de un módulo anidado
mod Parque {
    pub mod Juego {
        pub fn nombre() -> String {
            return "Columpio".to_string();
        }
    }
}

fn main() {
    println!("{}", Cine::direccion());//Instrucción aceptada
    println!("{}", Cine::empleados());//ERROR, no es un atributo público
    println!("{}", Parque::Juego::nombre());//Instrucción aceptada
}