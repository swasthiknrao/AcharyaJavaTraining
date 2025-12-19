package com.acharya.inherit;

import com.acharya.inherit.Employee;
import com.acharya.inherit.Manager;

public class Mainclass {

	public static void main(String[] args) {

		Manager managerOne = new Manager(15, "Manoj", 10000.00, 2500.00, 1200.00, 1000.00, 1000.00, 1100.00, 20000.00,true);
		managerOne.computeSalary();
		
		System.out.println("*************************");

		Employee employeeOne = new Employee(20, "Suprith", 8000.00, 2000.00, 1000.00, 800.00, 800.00, 1000);
		employeeOne.computeSalary();
		
		System.out.println("*************************");
		
		SalesPerson sales = new SalesPerson(10, "Prajwal", 6000.00, 1500.00, 800.00, 500.00, 500.00, 600.00, true,2000);
		sales.computeSalary();

	}

}
