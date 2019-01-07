package com.dp.structural.b3.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private List<Employee> subordinates;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
		subordinates = new ArrayList<>();
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	public void addEmployee(Employee employee) {
		subordinates.add(employee);
	}

	public void removeEmployee(Employee employee) {
		subordinates.remove(employee);
	}
}
