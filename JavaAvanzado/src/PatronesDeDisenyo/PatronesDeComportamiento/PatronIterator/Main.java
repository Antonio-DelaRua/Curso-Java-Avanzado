package PatronesDeDisenyo.PatronesDeComportamiento.PatronIterator;

public class Main {
    public static void main(String[] args){
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 25));
        usuarios.crear(new Usuario("tres", 45));
        usuarios.crear(new Usuario("cuatro", 74));
        usuarios.crear(new Usuario("cinco", 64));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es : " + usuario.getNombre());

        }

        usuarios.crear(new Usuario("seis", 34));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es : " + usuario.getNombre());

        usuarios.reinicia();

        while (usuarios.hayMas()) {
            usuario = usuarios.siguiente();
            System.out.println("Usuario es : " + usuario.getNombre());

        }


    }
}
