package ObjetosYDirectivaDeMenorConocimiento;

abstract public class FacturaElectrica {
    double impuesto = 21;


    double obtenerImpuesto  (double precio){
        return precio * impuesto/100;
    }


     //   return  precio * impuesto / 100;


    abstract double calcular();

    /**
     * public double calcularPrecioUsuario(){
     *         return 0.55 + obtenerImpuesto(0.55);
     *     }
     *
     *     public double calcurarPrecioEmpresa(){
     *         return 0.90 + obtenerImpuesto(0.90);
     *     }
     *
     */

}
