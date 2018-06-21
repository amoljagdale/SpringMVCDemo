package nice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("A");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		
		Set<String> hs = new HashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		System.out.println(al);
	}
}
