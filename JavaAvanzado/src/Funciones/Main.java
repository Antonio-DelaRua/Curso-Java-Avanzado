package Funciones;

public class Main {

    public static void main(String[] args){


        Usuarios usuarios = new Usuarios();
        Usuario usuario = new Usuario();
        usuario.nombre="paco";
        usuario.apellidos = "delis";
        usuario.edad = 34;
        usuario.puedeConducir = true;



       boolean esMayor = esMayor(4,2);
       boolean mayor = 4 > 2 ? true : false;
    }

    private static boolean esMayor(int a, int b){
       return a > b ? true : false;
    }
}

/**
 *  Funcion : es una agrupacion de codigo que debe realizar una tarea concreta, tiene un objetivo primordial que
 *  es la reutilizacion de codigo.
 *
 * una funcionalidad por funcion.
 *
 * funcion monadica : es una funcion que tiene un unico parametro.
 *
 * funcion diadica : es una funcion que tiene dos parametros.
 *
 * funcion triada : es una funcion que tiene tres parametros.
 *
 * funcion poliadica : es una funcion que tiene cuatro o mas parametros.
 */
