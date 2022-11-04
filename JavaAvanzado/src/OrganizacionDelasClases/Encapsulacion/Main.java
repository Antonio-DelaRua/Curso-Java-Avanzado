package OrganizacionDelasClases.Encapsulacion;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        usuario.setNombre("Aurelio el conquistador");
        usuario.setEdad(21);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
    }
}
