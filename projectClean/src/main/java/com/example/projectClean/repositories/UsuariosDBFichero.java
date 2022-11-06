package com.example.projectClean.repositories;
import com.example.projectClean.entities.Usuario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class UsuariosDBFichero extends UsuariosDB {
    public String ficheroDatos = " usuarios.txt";

    @Override
    public ArrayList<Usuario> obtener() {
        ArrayList<Usuario> usuarios = new ArrayList();
        try{
            Scanner scanner = new Scanner(new File(ficheroDatos));
            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String[] partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);

            }
            scanner.close();

        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {

    }

    @Override
    public void borrar(Usuario usuario) {

    }

}
