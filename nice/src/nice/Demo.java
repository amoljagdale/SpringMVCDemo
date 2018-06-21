package nice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "X");
		map.put(2, "A");
		map.put(3, "ABc");
		map.put(4, "Z");
		map.put(5, "jhg");

		Set<Entry<Integer, String>> entrySet = map.entrySet();
		List<Map.Entry<Integer, String>> list = new ArrayList<>(entrySet);

		System.out.println("After Sorting ....");
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<Integer, String> entry : list) {
			System.out.println(entry);
		}
	}
}
