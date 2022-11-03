package PatronesDeDisenyo.PatronesCreacionales.Builder;

public class CocheBuilder {

    Vehiculo vehiculo;

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;

    }

    public CocheBuilder setMarca(String marca) {
        vehiculo.marca = marca;
        return this;
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;

    }

    public CocheBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;

    }

    public Vehiculo build() {
        return this.vehiculo;
    }
}
