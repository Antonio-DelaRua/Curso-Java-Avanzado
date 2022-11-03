package RendimientoRecursion;

import static RendimientoRecursion.Main.sumaRecursiva;

public class Main2 {
    public static void main(String[] args) {
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
        sumaRecursiva(5);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo Final: " + (tiempoFinal - tiempoInicial + "Ms"));
    }
}
