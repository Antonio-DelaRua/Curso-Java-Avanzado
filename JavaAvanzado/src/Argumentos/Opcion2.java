package Argumentos;

public class Opcion2 {
    public static void main(String[] args){
        String opcionMinval = args[0];
        int valorMinVal = Integer.valueOf(args[1]);
        System.out.println("Opcion: " + opcionMinval + " valor " + valorMinVal);

        String opcionMaxval = args[2];
        int valorMaxval = Integer.valueOf(args[3]);
        System.out.println("Opcion: " + opcionMaxval + " valor " + valorMaxval);

    }
}
