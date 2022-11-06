package Patrones_Comportamiento.PatronIterator;


public interface UsuarioIterator {
    /**
     *  next();
     *  reset();
     *  hasmore();
     */

    // hay mas usuarios en el iterador?
    boolean hayMas();

    //Reinicia el contador del iterador
    void reinicia();

    // obtiene el siguiente
    Usuario siguiente();


}
