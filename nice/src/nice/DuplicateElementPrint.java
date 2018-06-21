package nice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementPrint {
	public static void main(String[] args) {
		/*List<String> al = new ArrayList<String>();
		al.add("A");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		al.add("D");*/
		
		/*Set<String> set = new HashSet<String>();
		for (String name : al) { 
			if(set.add(name)==false)
			{
				System.out.println(name);
			}
		}*/
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 1 };

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);

	}
}
