package com.acharya.inherit;

public class SalesPerson extends Employee {

	
		
		boolean target;
		double incentive;
		public SalesPerson(int id, String name, double basic_salary,
				double hra, double lta, double da, double pf, double tax,
				boolean target, double incentive) {
			super(id, name, basic_salary, hra, lta, da, pf, tax);
			this.target = target;
			this.incentive = incentive;
		}
		
		
		@Override 
		public void computeSalary() {
			
			double netsalary;
			if(target) {
				 netsalary = basic_salary + hra + da + lta - pf - tax + incentive;
			}
			else {
				netsalary = basic_salary + hra + da + lta - pf - tax;
			}
			System.out.println("The Sales Person net salary of "+id+" whose name is "+name+" is "+ netsalary);
		}

	}



