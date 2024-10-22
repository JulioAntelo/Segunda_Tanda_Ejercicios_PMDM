package Primera_Tanda_De_Ejercicios.Ejercicio_3

// Le falta añadir el daño total de 3 ataques
fun Solucion_3(){

    var ataqueTotal = 0

    for (i in 1..3){
        println("el ataque es de ${multiplicarAtaques(10)}")
        ataqueTotal += multiplicarAtaques(10)
        println("el ataque total es de $ataqueTotal")
    }

}

fun multiplicarAtaques(ataque:Int):Int{
    return ataque * 5
}