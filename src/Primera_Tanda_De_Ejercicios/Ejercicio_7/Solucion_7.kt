package Primera_Tanda_De_Ejercicios.Ejercicio_7

fun Solucion_7() {
    val Character1 = Character(700,12)
    val Character2 = Character(50, 90)
    while(Character1.Hp >=0 || Character2.Hp >=0) {
        println("Character 1 attacks")
        Character2.ReceiveDamage(Character1.Attack)
        if (Character2.Hp<=0) {
            println("Character 1 wins")
            break
        }
        println("Character 2 attacks")
        Character1.ReceiveDamage(Character2.Attack)
        if (Character1.Hp <=0 ){
            println("Character 2 wins")
            break
        }
    }

}

class Character (hp: Int, attack: Int){

    var Hp = hp
    var Attack = attack

    fun ReceiveDamage(Attack: Int):Int{
        Hp -= Attack
        println("Current Character hp is: $Hp")
        if(Hp <= 0){println("Combat has ended")}
        return Hp-Attack
    }
}
