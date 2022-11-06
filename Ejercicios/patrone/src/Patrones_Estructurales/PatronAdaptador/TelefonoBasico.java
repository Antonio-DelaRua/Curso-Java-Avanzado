package Patrones_Estructurales.PatronAdaptador;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear(){
        System.out.println("Telefono Basico");

        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println(" --> basico: Tengo Acceso a openBootCamp");
    }

    private void tengoSMS(){
        System.out.println(" --> basico: Tengo SMS");
    }
}
