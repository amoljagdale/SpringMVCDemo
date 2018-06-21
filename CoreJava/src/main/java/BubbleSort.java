
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9,14,3,2,43,11,58,22};
		bubbleSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j=1; j<(arr.length-i); j++) {
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
