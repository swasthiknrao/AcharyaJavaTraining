package com.acharya.inherit;

public class Manager extends Employee{
	
	double project_bonus;
	boolean project_on_time;
	public Manager(int id, String name, double basic_salary,
			double hra, double lta, double da, double pf, double tax,
			double project_bonus, boolean project_on_time) {
		super(id, name, basic_salary, hra, lta, da, pf, tax);
		this.project_bonus = project_bonus;
		this.project_on_time = project_on_time;
	}
	
	
	@Override 
	public void computeSalary() {
		
		double netsalary;
		if(project_on_time) {
			 netsalary = basic_salary + hra + da + lta - pf - tax + project_bonus;
		}
		else {
			netsalary = basic_salary + hra + da + lta - pf - tax;
		}
		System.out.println("The manager net salary of "+id+" whose name is "+name+" is "+ netsalary);
	}

}

