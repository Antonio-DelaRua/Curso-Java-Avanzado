package ProgramacionFuncional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// lenguajes funcionales :
public class Main {
    public static void main(String[] args) {

        //funciones pura : una funcion pura es toda aquella que dado unos mismos parametos de entrada siempre
        //produzca el mismo resultado de salida.
        // requesitos: no puede tener efectos colaterales.
        // solo elementos locales
        // si cambiamos una funcion de sumar a multiplicar ya no seria una funcion pura

        int result = suma(1,2);
        int result2 = suma(1,2);
        System.out.println(result + " " +  result2);

        Funcionales f = new Funcionales();
        f.pruebas();

        ArrayList<String> nombres = new ArrayList();
        nombres.add("paco");
        nombres.add("maria");
        nombres.add("pepe");

 //       nombres.stream().forEach(System.out::println);

 //       nombres.stream().forEach(x -> System.out.println(x));

        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        valores.forEach(x -> System.out.println(x));

        int []numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros  = Arrays.stream(numeros);
        //stNumeros.forEach(x -> System.out.println(x));
        var resultado = stNumeros.filter(x -> x % 2 == 0)
                .reduce(0, (x,y) -> {
                    System.out.println("X es " + x);
                    System.out.println("y es " + y);
                    return x + y;
                });
        System.out.println("Mi suma de pares es: " + resultado);

        int sumatotal = 0;
        for (int numero : numeros){
            numero = numero * 2;
            if (numero % 2 != 0){
                continue;
            }
            sumatotal += numero;
        }
        System.out.println("Multiplicacion de pares con For es: " + sumatotal + " y con la Suma: " + resultado);

  //      resultado.forEach(System.out::println);

  //      for (String nombre : nombres){
  //          System.out.println(nombre);
  //      }



        }
        public static int suma(int a, int b) {
            return a + b;
    }
}
