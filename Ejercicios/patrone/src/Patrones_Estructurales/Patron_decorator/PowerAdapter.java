package Patrones_Estructurales.Patron_decorator;

public class PowerAdapter implements Enchufable {

    public Lightbulb lightbulb = new Lightbulb();

    @Override
    public void enciende(){
        lightbulb.turnOn(110);
    }

    @Override
    public void apaga(){
        lightbulb.turnOf();
    }

    @Override
    public boolean estaEncendido(){
        return lightbulb.isPoweredOn();
    }
}
