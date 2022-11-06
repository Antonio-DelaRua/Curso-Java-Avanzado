package solidUsandoLaS;

public class Coche {
    public String marca;
    public String modelo;
    public String estilo;
    public String descripcion = "";
    public  int cv;
   

    @Override
    public String toString() {
        return "marca del coche: " + marca + "\r\n"
                + "modelo: "+ modelo + "\r\n"
                + "estilo: "+ estilo + "\r\n"
                + "descripcion: "+ descripcion + "\r\n"
                + "cv: " + "\r\n";
    }
}
