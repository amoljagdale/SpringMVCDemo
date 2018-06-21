package com.scp.comparable;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Employeee> d = new TreeSet<Employeee>();
        d.add(new Employeee(1));
        d.add(new Employeee(2));
        d.add(new Employeee(3));
 
        i.add(1);
        i.add(2);
        i.add(3);
        System.out.println(d);
	}
}
class Employeee implements Comparable<Employeee>{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employeee(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + "]";
	}

	@Override
	public int compareTo(Employeee o) {
		return this.id - o.id;
	}
	
}