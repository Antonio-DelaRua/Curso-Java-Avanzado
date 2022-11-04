package Argumentos;

public class opcion {
    public static void main(String[] args){

        int opcionMinVal = 0;
        int opcionMaxVal = 0;
        String opcionNombre = "";

        for (int i = 0; i < args.length; i++) {
            switch (args[i]){
                case "--minval":
                    opcionMinVal = Integer.parseInt(args[i + 1]);
                    i++;
                break;

                case "--maxval":
                    opcionMaxVal = Integer.parseInt(args[i + 1]);
                    i++;
                break;

                case "--nombre":
                    opcionNombre = args[i + 1];
                    i++;
                    break;
            }
        }
        System.out.println("valor de minVal : " + opcionMinVal);
        System.out.println("valor de MaxVal : " + opcionMaxVal);
        System.out.println("valor de Nombre : " + opcionNombre);
    }
}
