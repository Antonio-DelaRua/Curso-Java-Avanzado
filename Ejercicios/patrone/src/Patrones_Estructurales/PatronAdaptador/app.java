package Patrones_Estructurales.PatronAdaptador;

public class app {
    public static void main(String[] args){
      
            TelefonoNextGen tng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
            tng.crear();
    
        }
}

/**
 * 
 * @definicion:  es un patrón de diseño estructural que permite colaborar a objetos incompatibles. El patrón Adapter actúa como envoltorio entre dos objetos. Atrapa las llamadas a un objeto 
 * y las transforma a un formato y una interfaz reconocible para el segundo objeto.
 * 
 */
