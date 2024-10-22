fun main() {
    //ejercicio1()
    //ejercicio3()
    //ejercicio5()
    //ejercicio7()
    ejercicioFinal()
}



fun ejercicio1(){
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida")
}

fun ejercicio3(){
    val cofre = mutableListOf("Espada", "Escudo", "Poción")
    for (item in cofre){
        println("Has encontrado: $item")
    }
}



fun ejercicio5(){
    val Personaje = Personaje("patata",225,6)
    println("Nombre: ${Personaje.nombre}, Vida: ${Personaje.vida}, Ataque: ${Personaje.ataque}")
}
class Personaje(Nombre: String, Vida: Int, Ataque: Int) {
    var nombre = Nombre
    var vida = Vida
    var ataque = Ataque

}

fun ejercicio7(){
    fun multiplicar(num: Int): Int {
        return num * 2
    }

    println(multiplicar(5))
    val operacion: (Int, Int) -> Int = { a, b -> a + b }
    println(operacion(3, 4))
}


fun ejercicioFinal(){
    val goku = Personaje("Goku", 100,20)
    val vegeta = Personaje("Vegeta", 80,25)

    while(goku.vida >0 && vegeta.vida >0){
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque
        println("Vida de Goku = ${goku.vida}")
        println("Vida de Vegeta = ${vegeta.vida}")

    }

    if (goku.vida<=0){
        println("Vegeta wins")
    }else{
        println("Goku wins")
    }
}

