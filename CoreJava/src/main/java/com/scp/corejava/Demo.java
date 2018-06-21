package com.scp.corejava;

import java.util.*;

public class Demo {
	public static void main(String[] args) {

		Employee e1 = new Employee(11, "Amol");
		Employee e2 = new Employee(1, "Suraj");
		Employee e3 = new Employee(13, "Amruta");
		Employee e4 = new Employee(10, "Sagar");

	}

}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Employee obj) {
		return this.id - obj.id;
	}

}