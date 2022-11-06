package Inicial;

import Final.Usuario;
import Final.Usuarios;

public class App {
    public static void main(String []args) {
        Final.Usuario usuario = new Final.Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;

        Final.Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);

        Final.Usuario usuario2 = new Final.Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crearUsuario(usuario2);

        Final.Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.nombreUsuario);
        }
    }
}
