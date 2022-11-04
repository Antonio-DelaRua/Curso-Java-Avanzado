package ObjetosYDirectivaDeMenorConocimiento;

public class FacturaElectricaUsuario extends FacturaElectrica{
    @Override
    double calcular() {
        return 0.10 + obtenerImpuesto(0.10);
    }


}
