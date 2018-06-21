package nice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapWithValue {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 101);
		map.put(2, 11);
		map.put(3, 1);
		map.put(4, 89); 
		map.put(5, 986);

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);

		System.out.println("Sorting using value..");

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		for (Map.Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}
}
