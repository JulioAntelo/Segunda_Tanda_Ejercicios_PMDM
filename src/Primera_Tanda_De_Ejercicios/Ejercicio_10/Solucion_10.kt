package Primera_Tanda_De_Ejercicios.Ejercicio_10

fun Solucion_10(){
    val enemigo = Enemigo(500)

    val equipo = listOf(
        Equipo("Warrior", 50),
        Equipo("Fireball dude", 70),
        Equipo("Bard", 40),
        Equipo("Rogue", 80)
    )

    while (enemigo.vida > 0) {
        println("\nEl equipo ataca al enemigo:")
        for (miembro in equipo) {
            miembro.atacar(enemigo)
            if (enemigo.vida <= 0) {
                enemigo.vida = 0 //para que no haya overkill
                println("El enemigo sa matao")
                break
            }
        }
    }
}


class Enemigo(var vida: Int)

class Equipo(val nombre: String, val daño: Int) {
    fun atacar(enemigo: Enemigo) {
        enemigo.vida -= daño
        println("$nombre ataco e infligio $daño de daño. Vida restante del enemigo: ${enemigo.vida}")
    }
}


