package AplicandolaOdeSolid.Ejemplo2;

abstract class Vehiculo {
    String tipo;

    public String getTipoVehiculo() {
        return tipo;
    }

}

class coche extends Vehiculo { String tipo;
    public coche(String tipo) {this.tipo = tipo;}
}

class cocheElectrico extends Vehiculo {
    String baterias;

    public cocheElectrico(String tipo) {
        this.tipo = tipo;
        this.baterias = "si";
    }

    public String getBaterias(){
        return this.baterias;
    }

}


