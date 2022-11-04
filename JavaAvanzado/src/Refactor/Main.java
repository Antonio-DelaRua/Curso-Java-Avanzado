package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

      //  ConstructorLargo cosa = new ConstructorLargo("a", "b", "c", 5);
    ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("marca")
            .conModelo("Corsa")
            .conMotor("v8")
            .conPuertas(3);



        int []numeros = {12,23,45,1,9};
        imprimeMayorYMenor(numeros);

    }

    public static void imprimeMayorYMenor(int[] numeros){
       // int mayor = 0;
       // int menor = numeros[0];

        /**
         *    FORMA INICIAL
         *
         *  for (int i = 0; i < numeros.length; i++) {
         *             if (mayor < numeros[i]){
         *                 mayor = numeros[i];
         *             }
         *             if (menor > numeros[i]){
         *                 menor = numeros[i];
         *             }
         *         }
         */

        /**
         *  1 Refactorizacion
         *
         *  for (int i = 0; i < numeros.length; i++){
         *             mayor = mayor < numeros[i] ? numeros[i] : mayor;
         *             menor = menor > numeros[i] ? numeros[i]: menor;
         *         }
         */
        /**
         * 2 Refactorizacion
         *
         * for (int i : numeros){
         *             mayor = mayor < i ? i : mayor;
         *             menor = menor > i ? i : menor;
         *         }
         */

        int mayor = Arrays.stream(numeros).reduce(0,(a, b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0],(a,b) -> a < b ? a : b);


        System.out.println("Mayor: " + mayor + " y menor: " + menor);
    }


    /**
     *  Extraer el valor del retorno
     *
     * public static int ifAnidado1(){
     *         int valor1 = 10;
     *         int valor2 = 10;
     *
     *         if (valor1 > valor2){
     *             return valor1;
     *         } else {
     *             return valor2;
     *         }
     */


    public static int ifAnidado1() {
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2) {
            return valor1;
        }
        return valor2;

        }

    }
