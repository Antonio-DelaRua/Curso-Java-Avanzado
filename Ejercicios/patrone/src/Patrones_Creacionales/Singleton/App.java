package Patrones_Creacionales.Singleton;
public class App {
    public static void main(String[] args) throws Exception {
        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        app.Run();
        app2.Run();
        System.out.println(app + " RUXXDESING " + app2);
    }
}
