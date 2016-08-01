public class sort{
	
	public int[] SelectionSort(int[] array){
		int a=0, b=0;		
		for(int i=0; i<(array.length); i++){
			for(int j=i+1; j<(array.length); j++){
				if(array[j]< array[i]){
					a = array[j];
					b = array[i];
					array[j] = b;
					array[i] = a;
				}
			}
		}
		return array;
	}

	public String toString(){
		return "Este programa posee cinco algoritmos de ordenamiento distintos."+
			"Recibe como parámetro un array de int y regresa un array de int ordenado"+
			"de menor a mayor.";
	}
}