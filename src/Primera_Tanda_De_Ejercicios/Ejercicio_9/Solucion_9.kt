package Primera_Tanda_De_Ejercicios.Ejercicio_9

fun Solucion_9(){

    val personaje = Personaje("Davih")

    personaje.ganarBatalla()
    personaje.mostrarEstado()

    personaje.ganarBatalla()
    personaje.mostrarEstado()

    personaje.ganarBatalla()
    personaje.mostrarEstado()

    personaje.ganarBatalla()
    personaje.mostrarEstado()
}

class Personaje(val nombre: String) {
    var experiencia = 0
    var nivel = 1

    fun ganarBatalla() {
        experiencia += 50
        println("$nombre gano una batalla y ahora tiene $experiencia de experiencia.")
        subirNivel()
    }

    fun subirNivel() {
        if (experiencia >= 200) {
            nivel += 1
            experiencia -= 200
            println("$nombre ha subido de nivel. ahora es nivel: $nivel.")
        }
    }

    fun mostrarEstado() {
        println("Nombre: $nombre, Nivel: $nivel, Experiencia: $experiencia")
    }
}