package Primera_Tanda_De_Ejercicios

import Primera_Tanda_De_Ejercicios.Ejercicio_1.Solucion_1
import Primera_Tanda_De_Ejercicios.Ejercicio_2.Solucion_2
import Primera_Tanda_De_Ejercicios.Ejercicio_3.Solucion_3
import Primera_Tanda_De_Ejercicios.Ejercicio_4.Solucion_4
import Primera_Tanda_De_Ejercicios.Ejercicio_5.Solucion_5
import Primera_Tanda_De_Ejercicios.Ejercicio_6.Solucion_6
import Primera_Tanda_De_Ejercicios.Ejercicio_7.Solucion_7
import Primera_Tanda_De_Ejercicios.Ejercicio_8.Solucion_8
import Primera_Tanda_De_Ejercicios.Ejercicio_9.Solucion_9
import Primera_Tanda_De_Ejercicios.Ejercicio_10.Solucion_10

fun main() {
    while (true) {


        println("\n--- Menú de Ejercicios ---")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Salir")
        print("Selecciona una opción: ")

        var numeroEjercicio = readln().toInt()

        when (numeroEjercicio) {
            1 -> Solucion_1()
            2 -> Solucion_2()
            3 -> Solucion_3()
            4 -> Solucion_4()
            5 -> Solucion_5()
            6 -> Solucion_6()
            7 -> Solucion_7()
            8 -> Solucion_8()
            9 -> Solucion_9()
            10 -> Solucion_10()
        }
        if (numeroEjercicio == 11) {
            println("ha cerrado el programa")
            break
        }
    }
}