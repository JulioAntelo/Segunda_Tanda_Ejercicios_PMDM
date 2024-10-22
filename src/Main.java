public class Main {
    public static void main(String[]args){
        //System.out.println(ejercicios.ejercicio6("patata"));
    }
}


class ejercicios{

    public static String ejercicio2(int energia) {
        String estado = "";
        if (energia>=50){
            estado = "Personaje fuerte";
        }else{
            estado = "Personaje debil";
        }
        return estado;
    }

    public static void ejercicio4(){
        for (int i = 1; i<=5;i++ ){
            if (i == 3) continue;
            System.out.println(i);
        }
    }

    public static void ejercicio6(String personaje){
        if (personaje != null){
            System.out.println("El personaje es: " + personaje);
        }else{
            System.out.println("no hay Personaje");
        }
    }
}