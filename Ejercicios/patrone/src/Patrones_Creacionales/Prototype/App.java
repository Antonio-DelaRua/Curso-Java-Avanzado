package Patrones_Creacionales.Prototype;

public class App {
    public static void main(String[] args) throws Exception {
        Coche coche = new Coche();
        coche.puertas = 5;
        coche.modelo = "opc";
        coche.marca = "opel";

        System.out.println(coche.marca + " / " + coche.modelo + " / " + coche.puertas);

        try {
            Coche clonado = coche.clonar();
            clonado.puertas = 3;
            System.out.println(clonado.marca + " / " + clonado.modelo + " / " + clonado.puertas);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar : " + e.getMessage());
        }
    }

    }

    /**
     * @Definicion: es un patrón de diseño creacional que permite la clonación de objetos, incluso los complejos, 
     * sin acoplarse a sus clases específicas. Todas las clases prototipo deben tener una interfaz común que haga 
     * posible copiar objetos incluso si sus clases concretas son desconocidas.
     */
    

