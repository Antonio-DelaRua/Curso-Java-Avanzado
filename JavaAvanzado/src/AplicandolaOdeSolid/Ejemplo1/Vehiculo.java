package AplicandolaOdeSolid.Ejemplo1;

public interface Vehiculo {
    String getTipoVehiculo();
}

class coche implements Vehiculo {
    String tipo;

    public coche(String tipo) {this.tipo = tipo;}

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }
}

class cocheElectrico implements Vehiculo {
    String tipo;
    String baterias;

    public cocheElectrico(String tipo) {
        this.tipo = tipo;
        this.baterias = "si";
    }

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }

    public String getBaterias(){
        return this.baterias;
    }

}
