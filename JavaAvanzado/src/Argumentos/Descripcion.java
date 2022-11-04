package Argumentos;

public class Descripcion {
    public static void main(String[] args){
        // opcion VALOR

        if (args[0].equalsIgnoreCase("uno")){
             System.out.println("Hola");
         } else if (args[0].equalsIgnoreCase("dos")){
            System.out.println("Adios");
        }
    }
}

/**
 *
 * @see http://commons.apache.org/cli/ - Apache Commons CLI
 *
 * @see http://www.martiansoftware.com/jsap/  - JSAP
 *
 *
 *   if (args[0].equalsIgnoreCase("uno")){
 *             System.out.println("Hola");
 *         } else if (args[0].equalsIgnoreCase("dos")){
 *             System.out.println("Adios");
 *         }
 *
 *
 * System.out.println("Parámetros recibidos : " + args.length);
 *
 *         for (String arg : args){
 *             System.out.println("Argumento es : " + arg);
 *         }
 *         for (int i = 0; i < args.length; i++){
 *             System.out.println("Argumento recibido : " + args[i] + "Esta en la posicion" + i);
 *         }
 */

/**
 *
 *Argumentos : Son una sede de parametros que le pasamos a nuestros programas tanto al ejecutarlo o al invocarlo en un
 *  * entorno de desarrollo.
 *
 */
