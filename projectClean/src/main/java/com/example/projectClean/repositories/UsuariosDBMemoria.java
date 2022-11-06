package com.example.projectClean.repositories;
import com.example.projectClean.entities.Usuario;
import java.util.ArrayList;

public class UsuariosDBMemoria  extends UsuariosDB {
    ArrayList<Usuario> usuarios = new ArrayList();

    @Override
    public ArrayList<Usuario> obtener(){ return usuarios;}

    @Override
    public Usuario buscar(Usuario usuario){
        for (Usuario usuarioActual : obtener()){
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void insertar(Usuario usuario){
        for (Usuario usuarioActual : usuarios){
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return;
            }
        }
        usuarios.add(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {

    }


}
