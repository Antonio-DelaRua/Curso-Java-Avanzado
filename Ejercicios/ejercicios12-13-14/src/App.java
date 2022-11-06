public class App {
    public static void main(String[] args) throws Exception {

        //funcion 1
       saludarOpenBootCamp();
        
       // funcion 2
       int ivalor = 8;
       int ivalor2 = 6;

       int resultado = ivalor + ivalor2;

       System.out.println(resultado);

       // funcion 3
        int num=6;

        System.out.println(aprobadoExamen(num));




        //funcion 1
    }

    public static void saludarOpenBootCamp(){
        System.out.println("Hola Open BootCamp");
    }

        //funcion 2

    public static int sumaIvalor(int ivalor, int ivalor2){
        return ivalor + ivalor2;
         
    }

        //funcion 3
    
    public static boolean aprobadoExamen(int num){
        return num>5;
        
    }


}
