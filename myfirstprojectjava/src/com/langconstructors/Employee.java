package com.langconstructors;

public class Employee {
	int id;
	String name;
	double salary;
	//no arg constructor
	Employee(){
		id=101;
		name="bindu";
		salary=10000.00;
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e=new Employee();
		e.show();
		Employee e1=new Employee();
		e.show();
		Employee e2=new Employee();
		e.show();


		
				
		System.out.println("main method ended");
		
	}
	void show() {
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);

		
	}

}
