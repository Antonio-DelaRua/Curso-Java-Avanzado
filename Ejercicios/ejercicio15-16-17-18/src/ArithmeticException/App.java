package ArithmeticException;



public class App {
    public static void main(String[] args) throws Exception {
        

        App calculadora = new App();
        System.out.println(calculadora.dividir(10,0));

    }

    public int dividir(int a , int b){
        int respuesta = 0;
        try{
            respuesta = a / b;

        }
        catch(Exception e){
            
        System.out.println("capturamos el error y ponemos lo que queramos :)");
    }
    return respuesta;

}
}