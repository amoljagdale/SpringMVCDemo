package com.scp.important;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {
		List<String> listOfDuplicate = new ArrayList<String>();
		listOfDuplicate.add("Amol");
		listOfDuplicate.add("Amruta");
		listOfDuplicate.add("Sayali");
		listOfDuplicate.add("Sagar");
		listOfDuplicate.add("Amol");
		listOfDuplicate.add("Amruta");
		
		//Java 8 feature to optimism minimum code... and removing duplicate elements 
		List<Object> UniqueList = listOfDuplicate.stream().distinct().collect(Collectors.toList());
		System.out.println(UniqueList);

		List<String> UniqueList1 = new ArrayList<String>();
		System.out.println(listOfDuplicate);

		
		//Using this Removing Duplicate elements from the list...
	/*	Iterator<String> itr = listOfDuplicate.iterator();

		while (itr.hasNext()) {
			String duplicateWord = itr.next();
			if (UniqueList1.contains(duplicateWord)) {
				itr.remove();
			} else {
				UniqueList1.add(duplicateWord);
			}
		}
		System.out.println(UniqueList1);*/
		
		//Print only Duplicate Elements....
		Set<String> set= new HashSet<String>();
		for (String list : listOfDuplicate) {
			if(set.add(list)==false)
			{
				System.out.println(list);
			}
		}
		

	}

}
