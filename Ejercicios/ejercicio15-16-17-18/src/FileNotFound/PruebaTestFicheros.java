package FileNotFound;



public class PruebaTestFicheros {
 
	public static void main(String[] args) {
		TestFicheros t1 = new TestFicheros();
		String[] arrayLineas;
		arrayLineas = t1.obtenerLineasArchivo("C:/usuarios.txt");
		for(int i = 0; i < arrayLineas.length; i++){
			System.out.println(arrayLineas[i]);
		}
	}
}