package insertionSort;

public class InsertionSort {

	
	public static int[] insertionSort(int[] vetor) {
		int j, aux;
		
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i-1;
			
			while(j>=0 && vetor[j] > aux ){
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
		}
		
		return vetor;
	}
}
