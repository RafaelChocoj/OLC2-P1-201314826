
mod Parque {
    pub mod Lugar{
        fn distancia() -> f64 {
            return 6.24;
        }
        pub mod LastLevel{
            pub struct animal{
                tipo: &str,
                patas: i64,
                accion: &str
            }
            pub fn fuck() -> &str {
                return "Funciono perro!";
            }

            pub fn test2() -> animal {
                let an = animal{
                    tipo: "mamifero",
                    patas: 4,
                    accion: "popear"
                };
                return an;
            }
            pub fn test() -> animal {

                println!("{}", "hola aqui");
                return animal{
                    tipo: "mamifero",
                    patas: 4,
                    accion: "popear"
                };
            }

            pub fn dire2() -> String {
                return "holis xd".to_string();
            }
        }
    }
    pub fn direccion() -> String {
        return "6ta calle".to_string();
    }
    pub fn arbol() -> i64 {
        return 123;
    }


}

struct animalito{
    tipo: &str,
    patas: i64,
    accion: &str
}

fn test_animal() -> animalito {

    println!("{}", "123 hola aqui");
    return animalito{
        tipo: "mamifero",
        patas: 4,
        accion: "popear"
    };
}

fn main() {
    println!("{}", "It Works!");
    let var1 = Parque::Lugar::LastLevel::test();
    let var1 = Parque::Lugar::LastLevel::dire2();

    /*let var1 = animalito{
        tipo: "mam_ifero",
        patas: 4,
        accion: "popear"
    };*/
    //let var1 = test_animal();
    println!("{:?}", var1);
    println!("{}", var1);
    println!("{}", var1.tipo);

    println!("1 {}", Parque::direccion());
    println!("2 {}",Parque::direccion());
    println!(Parque::Lugar::distancia());

    //let a = ack(3, 5);
    //println!("{}", a); // 253
}

fn ack(m: i64, n: i64) -> i64 {
    if m == 0 {
        return n + 1;
    } else if n == 0 {
        return ack(m - 1, 1);
    } else {
        return ack(m - 1, ack(m, n - 1));
    }
}