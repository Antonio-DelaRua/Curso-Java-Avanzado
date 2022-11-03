package PatronesDeDisenyo.PatronesDeComportamiento.PatronObserver;


public class ReceptorSatelite implements Receptor {

    @Override
    public void recibe(){
        System.out.println("Señal recibida en satelite");
    }
}
