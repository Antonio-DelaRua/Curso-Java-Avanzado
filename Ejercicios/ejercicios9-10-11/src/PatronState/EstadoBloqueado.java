package PatronState;


public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "Desbloquear , movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara: La camara esta bloqueada, desbloquea el dispositivo";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto: La camara esta bloqueada, desbloquea el dispositivo";
    }
}
