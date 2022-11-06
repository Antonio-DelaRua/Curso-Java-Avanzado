package Patrones_Comportamiento.PatronMediator;

public class app {

    public static void main(String[] args){
        Mediator mediador = new MediadorConcreto();

        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        mediador.registra(colega1);
        mediador.registra(colega2);
        mediador.registra(colega3);

        colega1.envia();
        colega2.envia();
        colega3.envia();
    }
    
}

/**
 * 
 * @Definicion:  es un patrón de diseño de comportamiento que reduce el acoplamiento 
 * entre los componentes de un programa haciendo que se comuniquen indirectamente a través de un objeto mediador especial.
 * 
 */
