package ArquitecturaLimpia.OopenClosePrincipal;

abstract class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    abstract int obtenerPotencia();
}

/**
 *
 * valiente chapuza enseñar algo con errores y no corregirlos para que lo veamos *-* pero bueno ..
 *
 *
 * class Coche extends Vehiculo{
 *         @Override
 *         int obtenerPotencia() {return 1000;}
 *     }
 *
 *     class Moto extends Vehiculo{
 *         @Override
 *         int obtenerPotencia() {return 200;}
 *     }
 *
 *     class Furgoneta extends Vehiculo{
 *         @Override
 *         int obtenerPotencia() {return 600;}
 *     }
 */




