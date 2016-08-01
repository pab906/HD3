import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		int numero=0;
		
		System.out.println("Bienvenido\nIngrese el número de digitos que desea generar y ordenar: ");
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				numero = input.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("Error: Por favor, ingrese un número válido.");
			}
		}
		String resultado="";
		//Creación de array de un número específico de números aleatorios
		int [] array = new int[numero];
		array = new file().generate("datos.txt",numero);
		System.out.println("------ Input Array -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i];
		}
		System.out.println(resultado);
		
		//Instancia de clase sort que contienen los 5 tipos de ordenamiento
		sort Sort = new sort();

		//Selection Sort
		array = Sort.SelectionSort(array);
		resultado="";
		System.out.println("----- SelectionSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i];
		}
		System.out.println(resultado);

		/*Utilicen este template para imprimir sus resultados
		Cambien Template por el nombre de su Sort

		//Template Sort
		array = Sort.TemplateSort(array);
		resultado="";
		System.out.println("----- TemplateSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i];
		}
		System.out.println(resultado);
	*/
	}
}