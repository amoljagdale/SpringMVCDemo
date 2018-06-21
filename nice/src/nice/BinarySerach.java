package nice;

public class BinarySerach {
	public static void main(String[] args) {
		int[] arr = {1, 3,5,6,8,9,10 ,12, 45, 67, 89, 90};
		int key = 10;
		System.out.println("index of 10 is : "+binarySearching(arr, key));
	}

	private static int binarySearching(int[] arr, int key)
	{
		
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if(key == arr[mid]) {
				return mid;
			}
			if(key < arr[mid]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
