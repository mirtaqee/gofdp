package com.dp.structural.b3.composite;

public class Composite_Main {

	public static void main(String[] args) {
		
		Employee ceo = new Employee(1, "John", 50000.0);
		
		Employee vpSales = new Employee(2, "Joseph", 40000.0);
		Employee cto = new Employee(3, "Jonah", 40000.5);
		
		Employee bizmgr = new Employee(4, "Tom", 20000);
		Employee developer = new Employee(5, "harry", 20000);
		
		ceo.addEmployee(vpSales);
		ceo.addEmployee(cto);
		
		vpSales.addEmployee(bizmgr);
		
		cto.addEmployee(developer);
		
		for(Employee employee: ceo.getSubordinates()) {
			System.out.println("Head: "+employee);
			for(Employee level2Emp: employee.getSubordinates()) {
				System.out.println("Employee:"+level2Emp);
			}
		}

	}

}
