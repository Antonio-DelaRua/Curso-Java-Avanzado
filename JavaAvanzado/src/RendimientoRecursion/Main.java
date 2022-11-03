package RendimientoRecursion;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("suma iterativa" + suma(5));
        System.out.println("suma recursiva" + sumaRecursiva(5));
        System.out.println("suma funcional" + sumaFuncional(5));

        tailRecursion(5);
        headRecursion(5);

        System.out.println("Factorial iterativa" + factorial(5));
        System.out.println("Factorial recursiva" + factorialRecursivo(5));
        System.out.println("Factorial funcional" + factorialFuncional(5));



    }

    public static int factorial(int numero){
        int resultado = 1;

        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        return resultado;
    }


    public static int factorialRecursivo(int numero){
        if (numero == 0){
            return 1;
        }
        return numero * factorialRecursivo(numero -1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1,(a,b) -> a * b);
    }


    public static int sumaRecursiva(int numero){
        if(numero == 1){
            return 1;
        }
        return  numero + sumaRecursiva(numero -1);

    }



    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1,5)
                .reduce(0, (a,b) -> a + b);
    }

    public static void tailRecursion(int valor){
        if ( valor == 0){
            return;
        }
        System.out.println(valor);
        tailRecursion(valor -1);
    }

    public static void headRecursion(int valor){
        if (valor == 0){
            return;
        }
        headRecursion(valor -1);
        System.out.println(valor);
    }

    public static int suma(int max) {
        int resultado = 0;
        for (int i = 0; i <= max; i++) {
            resultado += i;
        }
        return resultado;
    }

}

// 2 tipos de recursividad :

//  recursividad de cola: es que lo ultimo que se ejecuta es la llamada de la funcion asi mismo.

// recursividdad de cabeza: cuando lo primero que hacemos es invocar a la funcion recursiva.

// ------------------------------------------------------------------------------------------

// ventaja : es que añade cierta claridad cuando tenemos que escribir y desplegar codigo.

// la recursividad es muy utilizado cuando tenemos que recorrer estructuras de arbol

// problemas de recursividad : consumo de memoria.
