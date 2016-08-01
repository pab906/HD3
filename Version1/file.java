import java.util.Random;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class file{
	public int[] generate(String name, int num){
		int [] array = new int [num];
		//Generación de cadena String con números enteros aleatorios de 0 a 9
		String cadena ="";
		Random random = new Random();
		while(true){
			cadena+=random.nextInt(10);
			if(cadena.length()==num)
				break;
		}
		//Creación de archivo "datos.txt" con el String generado previamente
		try{
			PrintWriter doc = new PrintWriter(name,"UTF-8");	
			doc.println(cadena);
			doc.close();
		}
		catch(Exception e){
			System.out.println("Error: No se ha podido crear el archivo.");
		}
		//Lectura de archivo datos.txt
		try{
			Scanner archivo = new Scanner(new File("datos.txt"));
			cadena = archivo.nextLine();	
		}
		catch(Exception e){
			System.out.println("Error: No se ha podido leer el archivo.");
		}
		for(int i=0; i<array.length; i++){
			array[i] = Integer.parseInt(cadena.substring(i,i+1));
		}
		//Retorna el array de números aleatorios
		return array;
	}
}