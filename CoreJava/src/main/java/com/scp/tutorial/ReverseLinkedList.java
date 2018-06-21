package com.scp.tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		List<String> list= new LinkedList<String>();
		list.add("Amol");
		list.add("Sagar");
		list.add("Amruta");
		list.add("Sayali");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		/*String[] arr= new String[list.size()];
		arr= list.toArray(arr);
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}*/
		
		
	}
}
