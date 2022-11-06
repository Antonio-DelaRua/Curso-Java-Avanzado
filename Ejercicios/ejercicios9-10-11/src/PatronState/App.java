package PatronState;

public class App {
    public static void main(String[] args){
        Telefono tel1 = new Telefono();

        System.out.println(tel1.estado.desbloquear());
        System.out.println(tel1.estado.abrirCamara());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
    }
}

/**
 * He escogido este patron porque me parece muy util extraer comportamientos con el estado, separadas y 
 * fuerza al objeto original a delegar el trabajo de una instancia de esas clases,
 *  en lugar de actuar por su cuenta.
 */