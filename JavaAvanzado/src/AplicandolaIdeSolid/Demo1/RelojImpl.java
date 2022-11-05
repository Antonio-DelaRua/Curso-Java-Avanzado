package AplicandolaIdeSolid.Demo1;

public class RelojImpl implements Reloj {
    @Override
    public String horaAactual() {
        return "10";
    }

    @Override
    public String minutoAactual() {
        return "08";
    }

    @Override
    public String segundoAactual() {
        return "45";
    }
}
