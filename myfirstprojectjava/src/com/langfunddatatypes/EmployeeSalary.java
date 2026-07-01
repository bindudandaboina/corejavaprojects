package com.langfunddatatypes;

public class EmployeeSalary {

	  void main( ) {
		  System.out.println("main method started");
		  
		  
		  EmployeeSalary es=new EmployeeSalary();
		  double salary =es.getEmployeeSalary();
		  
		  
		  System.out.println("employee total salary:"+salary);
	  	}
	  double getEmployeeSalary() {
		  double salary=300000.00;
		  double hra=5000.00;
		  double bonus=20000.00;
		  double total_salary=salary+hra+bonus;
		  return total_salary;

		  
	  }

}
