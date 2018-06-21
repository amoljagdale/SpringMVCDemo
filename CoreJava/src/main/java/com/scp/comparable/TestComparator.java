package com.scp.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codehaus.jackson.map.util.Comparators;

public class TestComparator {
	public static void main(String[] args) {
		Person person1 = new Person(12, "Amol");
		Person person2 = new Person(10, "F");
		Person person3 = new Person(4, "C");
		Person person4 = new Person(54, "Z");
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		System.out.println(list);
		// Collections.sort(list, new IdComparator());
		/*
		 * Comparator<Person> comparator = new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return o1.id - o2.id; }
		 * };
		 * 
		 * Collections.sort(list, comparator);
		 */
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.id - o2.id;
			}

		});
		System.out.println(list);

	}
}

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + "]";
	}

}
/*
 * class IdComparator implements Comparator<Person>{
 * 
 * @Override public int compare(Person o1, Person o2) { return o1.id - o2.id; }
 * 
 * }
 */