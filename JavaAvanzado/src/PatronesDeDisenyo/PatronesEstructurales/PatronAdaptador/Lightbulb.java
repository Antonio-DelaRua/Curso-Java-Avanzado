package PatronesDeDisenyo.PatronesEstructurales.PatronAdaptador;

public class Lightbulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lightbulb poweredOn with " + voltage + "of current");
    }

    public void turnOf(){
        poweredOn = false;
        voltage = 0;
        System.out.println("Lightbul poweredOFF");
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
