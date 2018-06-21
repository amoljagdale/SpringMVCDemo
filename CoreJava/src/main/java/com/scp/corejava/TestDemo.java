package com.scp.corejava;

import java.util.ArrayList;

public class TestDemo {
	public static void main(String[] args) {
		/*LinkedHashMap<Integer, String> mapList = new LinkedHashMap<Integer, String>(10, 0.5f, false);
		mapList.put(1, "Swapnil");
		mapList.put(2, "XYZ");
		mapList.put(3, "PQR");
		mapList.put(1, "RANVEER1");
		mapList.put(5, "RAJ");

		System.out.println(mapList);*/
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("Amol");
		list.add("A");
		list.add("B");
		list.add("C");
		for (String object : list) {
			String str = object;
			System.out.println(object);
		}
		list.remove(2);
		for(int i= 0; i<list.size(); i++)
		{
			String item = list.get(i);
			System.out.println(item);
		}
		
		/*IdentityHashMap<String, String> map = new IdentityHashMap<String, String>();
		map.put("Amol", "A");
		map.put("XYZ", "B");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println("-----------------");
		map.put(new String("Amol"), "Z");
		map.put("Amol", "AAA");
		System.out.println(map.size());
		System.out.println(map);
		*/
	
	}

}
