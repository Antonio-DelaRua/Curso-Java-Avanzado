package PatronesDeDisenyo.PatronesDeComportamiento.Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //UsuariosMemoria usuarios = new UsuariosMemoria();

        UsuariosFichero usuarios = new UsuariosFichero();
            crear(usuarios,"fulano");
            crear(usuarios,"mengano");
            crear(usuarios, "pepe");

        for (String usuario : usuarios.listar()){
            System.out.println(usuario);
        }
    }


    public static void crear(Usuarios usuario, String nombre){
        usuario.crear(nombre);
    }

    public ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }


}
