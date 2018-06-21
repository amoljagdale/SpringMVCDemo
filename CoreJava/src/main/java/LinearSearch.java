
public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int n = arr.length;
		
		System.out.println(search(arr, n, 80));
	}
	private static int search(int[] arr, int n, int  x) {
		for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
  
        return -1;		
	}
	
}
