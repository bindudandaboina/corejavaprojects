package com.langfund;

public class Employee {
//	static variables
	static String companyName = "tech solutions";
	// instance variables
	int empid;
	String empname;

	Employee(String name, int id) {
		empid = id;
		empname = name;
	}

	void display() {
		System.out.println("employee name:" + empname);
		System.out.println("employee id:" + empid);
		System.out.println("company name:" + companyName);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("bindu", 1);
		Employee e2 = new Employee("bhumi", 2);
		e1.display();
		e2.display();

	}

}
