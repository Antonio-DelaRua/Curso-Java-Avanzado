package PatronesDeDisenyo.PatronesCreacionales.Prototype;

public class Main {
    public static void main(String[] args) {
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
