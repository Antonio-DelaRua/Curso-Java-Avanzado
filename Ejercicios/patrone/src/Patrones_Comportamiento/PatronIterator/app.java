package Patrones_Comportamiento.PatronIterator;

public class app {

    public static void main(String[] args){
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Maria", 5));
        usuarios.crear(new Usuario("Juani", 25));
        usuarios.crear(new Usuario("Paco", 45));
        usuarios.crear(new Usuario("Pepe", 74));
        usuarios.crear(new Usuario("Luis", 64));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es : " + usuario.getNombre());

        }

        usuarios.crear(new Usuario("Bonus", 34));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es : " + usuario.getNombre());

        usuarios.reinicia();

        while (usuarios.hayMas()) {
            usuario = usuarios.siguiente();
            System.out.println("Usuario es : " + usuario.getNombre());

        }


    }
    
}

/**
 * 
 * @Descripcion: Iterator es un patrón de diseño de comportamiento que permite el recorrido secuencial por una estructura de datos compleja 
 * sin exponer sus detalles internos. Gracias al patrón Iterator, 
 * los clientes pueden recorrer elementos de colecciones diferentes de un modo similar, utilizando una única interfaz iteradora.
 */
