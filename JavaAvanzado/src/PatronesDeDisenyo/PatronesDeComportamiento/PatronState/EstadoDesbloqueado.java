package PatronesDeDisenyo.PatronesDeComportamiento.PatronState;

public class EstadoDesbloqueado extends Estado{
    public EstadoDesbloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear: el movil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "Camara abierta, puedes hacer la foto";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto: Nose puede hacer una foto sin abrir la camara";
    }

}
