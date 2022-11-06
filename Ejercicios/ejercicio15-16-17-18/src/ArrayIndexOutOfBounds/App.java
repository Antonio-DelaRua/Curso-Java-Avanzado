package ArrayIndexOutOfBounds;



public class App {
    public static void main(String[] args)  {
        int arr[] = {1,2,3,4,5,6};

        for(int no : arr){
            System.out.println(no);
        }

        
        
        try{
        System.out.println(arr[7] + " " + arr[8] + " " + arr[9]);

        } catch (ArrayIndexOutOfBoundsException ao){
            System.out.println("No se encuentra en el indice por favor introduce el correcto");
        }
    }

}
    

