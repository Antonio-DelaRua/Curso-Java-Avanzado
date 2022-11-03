package PatronesDeDisenyo.PatronesEstructurales.PatronAdaptador;

public class Main {

    public static void main (String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lightbulb = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(lightbulb);

        System.out.println(estaEncendido(horno));
        System.out.println(estaEncendido(lightbulb));
        System.out.println(estaEncendido(lampara));

    }

    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }

    public static boolean estaEncendido(Enchufable enchufable){
        return enchufable.estaEncendido();
    }
}
