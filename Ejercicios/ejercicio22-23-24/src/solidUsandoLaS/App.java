package solidUsandoLaS;

public class App {
    public static void main(String[] args) throws Exception {
        Coche coche = new Coche();
        coche.marca = "Ferrari";
        coche.modelo = "F40";
        coche.estilo = "Deportivo";
        coche.descripcion = "historico de ferrari";
        coche.cv = 599;
        
        

       System.out.println(coche);

       CocheElectrico coche2 = new CocheElectrico();
        coche2.marca = "tesla";
        coche2.modelo = "f342";
        coche2.estilo = "paseo";
        coche2.descripcion = "trendin";
        coche2.cv = 120;
       coche2.alimentacion = "baterias";
       System.out.println(coche2);

     
        
    }
}
