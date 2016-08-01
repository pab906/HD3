public class sort{
	
	private static void merge(num[] data, num[] temp, int low, int middle, int high){
		int ri = low;
		int ti = low;
		int di = middle;
		while(ti<middle && di<=high){
			if(data[di].compareTo(temp[ti])==0){
				data[ri++] = data[di++];
			} else {
				data[ri++]=temp[ti++];
			}
		}
		while(ti<middle){
			data[ri++]=temp[ti++];
		}
	}
	
	private static void mergeSortRecursive(num[] data, num[] temp, int low, int high){
		int n = high-low+1;
		int middle = low + n/2;
		int i;
		if(n<2){ 
			return;
		}
		for(i = low; i<middle; i++){
			temp[i] = data[i];
		}
		mergeSortRecursive(temp, data, low, middle-1);
		mergeSortRecursive(data, temp, low, middle-1);
		merge(data, temp, low, middle, high);
	} 
	
	public static void mergeSort(num[] data, int n){
		mergeSortRecursive(data, new num[n], 0, n-1);
	}
	
	public num[] SelectionSort(num[] array){
		int a=0;
		for(int i=0; i<(array.length); i++){
			for(int j=i+1; j<(array.length); j++){
				if(array[j].compareTo(array[i])==-1){
					a = array[j].getvalue();
					array[j].setvalue(array[i].getvalue());
					array[i].setvalue(a);
				}
			}
		}
		return array;
	}

	public num[] InsertionSort (num[] array){
		int numOrdenados=1;
		int indice=0;

			while (numOrdenados<(array.length)){
				int temp=array[numOrdenados].getvalue();

				for (indice=numOrdenados; indice>0; indice--){

						if(temp<array[indice-1].getvalue()){
								array[indice]=array[indice-1];
						}else{
								break;
						}

					}
			array[indice].setvalue(temp);
			numOrdenados=numOrdenados+1;

			}
		return array;
		}
	
	public static num[] sort(num[] old) {
		  
	    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
	        num[] tmp = new num[old.length];
	        int j = 0;
	        for (int i = 0; i < old.length; i++) {
	            //boolean move = old[i] << shift >= 0;
				boolean move =false;
	            if (shift == 0 ? !move : move) {
	                tmp[j] = old[i];
	                j++;
	            } else {
	       
	                old[i - j] = old[i];
	            }
	        }
	        for (int i = j; i < tmp.length; i++) {
	            tmp[i] = old[i - j];
	        }
	 
	        old = tmp;
	    }
	 
	    return old;
	}
	
	public String toString(){
		return "Este programa posee cinco algoritmos de ordenamiento distintos."+
			"Recibe como parÃ¡metro un array de int y regresa un array de int ordenado"+
			"de menor a mayor.";
	}
}
