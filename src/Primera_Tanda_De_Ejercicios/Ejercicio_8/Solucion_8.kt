package Primera_Tanda_De_Ejercicios.Ejercicio_8

fun Solucion_8(){
    var inventario:MutableList<Objeto>
    val espada = Objeto("espada bastarda", "arma")
    val escudo = Objeto("escudo medio roto", "arma")
    val casco = Objeto("casco de blaid", "armadura")
    val armadura_completa = Objeto("armadura completa de solair", "armadura")


    println("¿Que desea hacer en el inventario?")
    
}

class Objeto(Nombre: String, TipoObjeto : String){
    var nombre = Nombre
    var TipoObjeto = TipoObjeto
}