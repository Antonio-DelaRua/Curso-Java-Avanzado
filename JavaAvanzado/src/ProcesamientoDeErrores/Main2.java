package ProcesamientoDeErrores;

public class Main2 {
    public static void main(String[] args) {
        a();

    }

    public static void a() {
        b();

    }

    public static void b() {
        int valor = 5 ;
        try {
            valor = valor / 0;
        }catch (Exception e) {
            valor = valor / 1;
        }
        System.out.println("estoy aqui, valor tiene: " + valor);

    }
}