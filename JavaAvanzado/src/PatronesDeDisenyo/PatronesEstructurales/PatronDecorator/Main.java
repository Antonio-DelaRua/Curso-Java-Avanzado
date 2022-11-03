package PatronesDeDisenyo.PatronesEstructurales.PatronDecorator;

public class Main {
    public static void main(String[] args){
    //    TelefonoBasico telofonobasico = new TelefonoBasico();
    //    telofonobasico.crear();

    //    TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
    //    ti.crear();

        TelefonoNextGen tng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        tng.crear();

    }
}
