package nice;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumber {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 1 };
		Set<Integer> set = new HashSet<Integer>();
		for (int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					set.add(arr[i]);
					break;
				}
			}
		}
		System.out.println(set);
	}
}
