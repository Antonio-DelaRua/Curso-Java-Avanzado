package com.example.projectClean.services;

import com.example.projectClean.entities.UsuariosBuilder;
import com.example.projectClean.repositories.UsuariosDB;
import com.example.projectClean.repositories.UsuariosDBMemoria;
import com.example.projectClean.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UsuariosService {

    UsuariosDB usuariosDB = new UsuariosDBMemoria();

    public void Usuarios(UsuariosDB usuariosDB){ this.usuariosDB = usuariosDB; }

    private void Usuarios(){}

    public ArrayList<Usuario> listarUsuarios(){ return usuariosDB.obtener();}

    public Usuario obtenerUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        return usuariosDB.buscar(usuario);
    }

    public void crearUsuario(Usuario usuario){
        if(usuariosDB.buscar(usuario) != null){
            return;
        }

        Usuario usuarioFiltrado = crearUsuarioReal(usuario);
        usuariosDB.insertar(usuarioFiltrado);
    }

    public void borrarUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }

    private Usuario crearUsuarioReal(Usuario usuario) {
        UsuariosBuilder usuariosBuilder = new UsuariosBuilder(usuario.nombreUsuario);
        return usuariosBuilder
                .conNombre(usuario.nombre.length() > 0 ? usuario.nombre : "Sin nombre")
                .conApellidos(usuario.apellidos.length() > 0 ? usuario.apellidos : "Sin apellidos")
                .conEmail(usuario.email.length() > 0 ? usuario.email : "Sin Email")
                .conNivelDeAcceso(usuario.nivelAcceso > 0 ? usuario.nivelAcceso : 0)
                .build();


    }






}
