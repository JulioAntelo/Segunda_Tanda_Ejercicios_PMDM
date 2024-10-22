package Primera_Tanda_De_Ejercicios.Ejercicio_6
import kotlin.random.Random


fun Solucion_6(){
    val ataque = Random.nextInt(0,101)

    println(isCrit(ataque))
}

fun isCrit(ataque:Int):Int{
    if(ataque>=50){
        println("¡Golpe crítico!")
        return ataque*2
    }else return ataque
}
