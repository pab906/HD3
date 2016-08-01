import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		int numero=0;

		System.out.println("Bienvenido\nIngrese el numero de digitos que desea generar y ordenar: ");
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				numero = input.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("Error: Por favor, ingrese un nÃºmero vÃ¡lido.");
			}
		}
		String resultado="";
		//CreaciÃ³n de array de un nÃºmero especÃ­fico de nÃºmeros aleatorios
		int [] arrayrandom = new int[numero];
		num [] array = new num[numero];
		//Se llama al mÃ©todo generate de la clase File para generar el txt con nÃºmeros
		arrayrandom = new file().generate("datos.txt",numero);
		//Se asignan los valores aleatorios a el array de la clase que implementa Comparable
		for(int i=0; i<array.length; i++){
			array[i] = new num();
			array[i].setvalue(arrayrandom[i]);
		}
		System.out.println("------ Input Array -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);

		//Instancia de clase sort que contienen los 5 tipos de ordenamiento
		sort Sort = new sort();

		//Selection Sort
		array = Sort.SelectionSort(array);
		resultado="";
		System.out.println("----- SelectionSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);

        //Insertion Sort
		array = Sort.InsertionSort(array);
		resultado="";
		System.out.println("----- InsertionSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);

		//Merge Sort
		sort.mergeSort(array, array.length);
		resultado="";
		System.out.println("----- MergeSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
		
		 //Radix Sort
		array = Sort.sort(array);
		resultado="";
		System.out.println("----- RadixSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
		

		
		/*Utilicen este template para imprimir sus resultados
		Cambien Template por el nombre de su Sort

		//Template Sort
		array = Sort.TemplateSort(array);
		resultado="";
		System.out.println("----- TemplateSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
	*/
	}
}
