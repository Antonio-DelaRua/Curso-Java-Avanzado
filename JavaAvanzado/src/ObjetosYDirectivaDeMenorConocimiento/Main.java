package ObjetosYDirectivaDeMenorConocimiento;

public class Main {
    public static void main(String[] args){
        FacturaElectrica fe = new FacturaElectricaEmpresas();
        System.out.println(fe.calcular());

        FacturaElectrica feu = new FacturaElectricaUsuario();
        System.out.println(feu.calcular());

    }
}
