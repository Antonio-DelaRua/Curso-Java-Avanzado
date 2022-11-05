package ArquitecturaLimpia.OopenClosePrincipal;


public class MainSolid {
    public static void main(String[] args){
        Vehiculo []vehiculos = {
         //       new Coche(),
         //       new Moto(),
         //       new Furgoneta(),
        };

        imprimePotencia(vehiculos);
    }
    public static void imprimePotencia(Vehiculo []vehiculos){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerPotencia());

        }

    }
}
