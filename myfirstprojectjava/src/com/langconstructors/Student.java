package com.langconstructors;
//deafult,no arg
public class Student {
	int id;
	String name;
	String Course;

	Student() {
		id = 101;
		name = "bindu";
		Course = "jfs";
	}
	void display() {
	System.out.println("student id:" + id);
	System.out.println("student name:" + name);
	System.out.println("student course:" + Course);
	}

	
	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student();
				s.display();
		System.out.println("main method ended");

	}

}
