package AplicandoLaSdeSolid.ejemplo2;

public class Main {

    public static void main(String [] args){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openBootCamp";
        usuario.nombre = "open";
        usuario.apellidos = "BootCamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;

        Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openBootCamp";
        usuario2.nombre = "open";
        usuario2.apellidos = "BootCamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crearUsuario(usuario2);

        Usuario openbootcamp = usuarios.obtenerUsuario("openBootCamp2");
        System.out.println(openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()){
            System.out.println(a.nombreUsuario);
        }

    }
}
