package ArquitecturaLimpia.SsingleresposibilityPrincipal;

/**
 * Principio S de SOLID
 */


public class Vehiculo {
    String tipo;

    public Vehiculo (String tipo) {this.tipo = tipo;}

    public String getTipo() {return tipo;}

    public class VehiculoDB {
        public void guardaVehiculoDB(Vehiculo vehiculo){
            //conecto a la bbdd
            // verifico que no este previamente registrado
            // inserto el registro
            //finalizo
    }


    }


}
