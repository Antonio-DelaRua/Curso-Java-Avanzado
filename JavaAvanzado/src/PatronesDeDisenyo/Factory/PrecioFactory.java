package PatronesDeDisenyo.Factory;

public class PrecioFactory {

    Precio precio;

    private PrecioFactory(){};

    public PrecioFactory(String pais){
       if (pais.equalsIgnoreCase("España")){
           System.out.println("España, Precio en EUR");
           this.precio = new PrecioEURO();
       } else if (pais.equalsIgnoreCase("UK")){
           System.out.println("Estamos en UK");
           this.precio = new PrecioGBP();
       } else {
            System.out.println("Otro pais , precio en USD ");
            precio = new PrecioUSD();
        }

    }

    public double getPrecio(){
        return precio.getPrecio();
    }
}
