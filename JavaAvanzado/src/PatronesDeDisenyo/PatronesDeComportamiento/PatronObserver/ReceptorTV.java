package PatronesDeDisenyo.PatronesDeComportamiento.PatronObserver;

public class ReceptorTV implements Receptor{
    @Override
    public void recibe(){
        System.out.println("Señal recibida en TV");
    }
}
