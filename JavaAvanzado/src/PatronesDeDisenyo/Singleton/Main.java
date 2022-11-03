package PatronesDeDisenyo.Singleton;

public class Main {
    public static void main(String[] args) {

        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        app.Run();
        app2.Run();
        System.out.println(app + " RUXXDESING " + app2);


/**
 * Singleton singleton = Singleton.getInstance();
 *         singleton.setContador(15);
 *
 *         Singleton singleton2 = Singleton.getInstance();singleton2.setContador(20);
 *
 *         System.out.println("Valor: " + singleton.getContador() + "en memoria " + singleton);
 *         System.out.println("Valor: " + singleton.getContador() + "en memoria " + singleton2);
 */



/**
 *   singleton.setContador(15);
 *         System.out.println(singleton.getContador());
 *         System.out.println(singleton);
 *  Singleton singleton2 = singleton.getInstance();
 *         singleton2.setContador(15);
 *         System.out.println(singleton2.getContador());
 *         System.out.println(singleton2);
 */

    }
}
