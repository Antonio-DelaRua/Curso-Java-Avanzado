package Patrones_Estructurales.PatronAdaptador;

public class TelefonoInteligente extends TelefonoDecorator {
    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }
    @Override
    public void crear(){
        super.crear();
        System.out.println("  -->inteligente : Tengo tambien 4G");
    }
}
