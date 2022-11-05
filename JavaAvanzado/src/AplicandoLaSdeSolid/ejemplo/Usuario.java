package AplicandoLaSdeSolid.ejemplo;

public class Usuario {
    public void crearUsuario(String username){}
    public void obtenerUsuario(String username){}
    public void notificarUsuario(String username){
        Emailer emailer = new Emailer();
        emailer.eviarEmail(this);
    }



}


