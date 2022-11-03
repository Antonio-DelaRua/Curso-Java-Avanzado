package PatronesDeDisenyo.PatronesCreacionales.Builder;

public class Main {
    public static void main(String[] args) {
/**
 *  Vehiculo vehiculo = new Vehiculo();
 *         vehiculo.setMarca("Opel");
 *         vehiculo.setMotor("Opc");
 *         vehiculo.setTipo("Deportivo");
 *         vehiculo.setPuertas(3);
 */

        Vehiculo coche = new CocheBuilder("Opel")
                .setPuertas(5)
                .setMotor("clasico")
                .setTipo("deportivo")
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Tipo: " + coche.getTipo());


    }
}
