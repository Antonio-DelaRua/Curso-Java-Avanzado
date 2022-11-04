package ProcesamientoDeErrores;

public class Main {

    public static void main(String[] args){
        a();

    }

    public static void a(){
        b();

    }

    public static void b(){
         try {

                  int valor = 5 / 0;

                  } catch (Exception e){
                     System.out.println("esto es una division por cero");


                      for(StackTraceElement valor : e.getStackTrace()) {
                       System.out.println("--> Linea: " + valor.getLineNumber() + " " + valor.getMethodName());
                   }
                 }
    }
}
