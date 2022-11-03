package ProgramacionFuncional;

import java.util.function.Function;

public class Funcionales {


    private Function<String,String> toMayus = x -> x.toUpperCase();
    private Function<Integer,Integer> sumador = x -> x.sum(x,x);

    // esto seria lo mismo : private ArrayList<String> listArray;

    public static void main(String[] args){}

    public void pruebas(){
        Saluda(toMayus, "Delarua");
        System.out.println(toMayus.apply("Rua"));
        System.out.println(sumador.apply(5));
    }

    public void Saluda(Function<String,String> mifuncion, String nombre){

        mifuncion.apply(nombre);

    }
}
