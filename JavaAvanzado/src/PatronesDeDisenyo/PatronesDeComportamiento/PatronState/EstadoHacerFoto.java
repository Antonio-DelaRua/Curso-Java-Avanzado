package PatronesDeDisenyo.PatronesDeComportamiento.PatronState;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "ya has abierto la camara";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return " Foto lista";
    }
}
