package insertionSort;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = new int[] {3, 2, 1, 10, 1, 3, 5};
		
		InsertionSort.insertionSort(vetor);
		
		for (int i : vetor) {
			System.out.println(i);
		}
		
	}
}
