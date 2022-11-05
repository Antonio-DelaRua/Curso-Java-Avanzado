package AplicandoLaSdeSolid.ejemplo2;

public class Usuario {
    public String nombreUsuario;
    public String nombre;
    public String apellidos;
    public String email = "";
    public  int nivelAcceso;

    @Override
    public String toString() {
        return "nombre de Usuario " + nombreUsuario + "\r\n"
                + "nombre"+ nombre + "\r\n"
                + "apellidos"+ apellidos + "\r\n"
                + "email"+ email + "\r\n"
                + "nivelAcceso" + "\r\n";
    }
}
