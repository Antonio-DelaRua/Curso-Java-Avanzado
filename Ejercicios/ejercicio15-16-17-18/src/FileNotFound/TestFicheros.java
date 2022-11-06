package FileNotFound;

 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class TestFicheros {
	public String[] obtenerLineasArchivo(String nombreArchivo){
		String[] arrayCadenas = new String[5];
		FileReader leer;
		BufferedReader filtro;
		String linea;
		int contador = 0;
		try {
			leer = new FileReader(nombreArchivo);
			filtro = new BufferedReader(leer);
			linea = filtro.readLine();
			while(linea != null){
				arrayCadenas[contador] = linea;
				linea = filtro.readLine();
				contador++;
			}
			filtro.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayCadenas;
	}
}
