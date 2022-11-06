package PatronState;


public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear: ya estaba desbloqueado el movilmafrend";
    }

    @Override
    public String abrirCamara() {
        return "abrircamara: la camara ya la habias abierto";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "la foto se va a disparar ya...";
    }
}
