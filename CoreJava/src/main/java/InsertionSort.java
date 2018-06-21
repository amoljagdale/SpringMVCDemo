
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {9,14,3,2,43,11,58,22};
		
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] arr) {
		for(int j=0; j<arr.length; j++) {
			int key = arr[j];
			int i = j-1;
			while((i>-1) && arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		
	}
}
