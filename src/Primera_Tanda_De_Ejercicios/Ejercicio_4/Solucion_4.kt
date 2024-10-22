package Primera_Tanda_De_Ejercicios.Ejercicio_4

fun Solucion_4(){
    var monedas= 0
    for (i in 1..10){
        monedas += 5
        println("En la tanda $i el numero de monedas total es de: $monedas monedas")
    }
}