package Primera_Tanda_De_Ejercicios.Ejercicio_5

fun Solucion_5(){
    println("Cual es el nivel de tu personaje?")
    var nivel = readln().toInt()
    if (nivel <10)println("Personaje principiante")
    if (nivel >=10 && nivel <=20)println("Personaje intermedio")
    if (nivel >20)println("Personaje Avanzado")
    else println("El nivel introducido no es valido")
}