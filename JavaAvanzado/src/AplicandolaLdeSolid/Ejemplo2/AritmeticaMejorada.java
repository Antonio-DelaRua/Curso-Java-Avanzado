package AplicandolaLdeSolid.Ejemplo2;

abstract class AritmeticaMejorada extends Aritmetica{

    @Override
    public int suma (int A, int B){
        return A + B;
    }


    public int multiplicacion (int A, int B){
        return A * B;
    }



    public int resta(int A, int B){
        return A - B;
    }




    public int division (int A, int B){
        return A / B;
    }

}
