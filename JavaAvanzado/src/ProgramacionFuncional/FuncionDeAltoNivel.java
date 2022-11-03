package ProgramacionFuncional;
import java.util.ArrayList;
import java.util.function.Function;

public class FuncionDeAltoNivel {

    // una funcion de alto nivel es una funcion que recibe como parametro otra funcion

    private Function<String,String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer,Integer> sumador = (x) -> x.sum(x,x);

    // esto seria lo mismo : private ArrayList<String> listArray;

    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        f.pruebas();

    }

    public void pruebas(){
       System.out.println(toMayus.apply("Rua"));
        System.out.println(sumador.apply(5));
    }



}
