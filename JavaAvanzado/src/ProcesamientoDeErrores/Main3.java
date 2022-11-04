package ProcesamientoDeErrores;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args)throws IOException{
        int valor = 5 ;
        divisionPorCero(valor) ;
        System.out.println("estoy aqui, valor tiene: " + valor);
    }
    public static int divisionPorCero(int valor) throws IOException {
        int resultado = 0;
        try {
            resultado = valor / 0;
        }catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;
    }
}
