package com.example.projectClean.entities;

public class UsuariosBuilder {
    private Usuario usuario = new Usuario();


        public  UsuariosBuilder(String nombreUsuario){
            usuario.nombre= "";
            usuario.apellidos="";
            usuario.email="";
            usuario.nivelAcceso = 0;

            usuario.nombreUsuario = nombreUsuario;

        }

    public UsuariosBuilder conNombre(String nombre){
        usuario.nombre = nombre;
        return this;
    }

    public UsuariosBuilder conApellidos(String apellidos){
        usuario.apellidos = apellidos;
        return this;
    }

    public UsuariosBuilder conEmail(String email){
        usuario.email = email;
        return this;
    }

    public UsuariosBuilder conNivelDeAcceso(int nivelAcceso){
        usuario.nivelAcceso = nivelAcceso;
        return this;
    }


    public Usuario build() {
        return usuario;
    }



}
