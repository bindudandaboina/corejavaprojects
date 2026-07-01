package com.langconstructors;

public class Student1 {
	int id;
	String name;
	double marks;
	String course;
	
	//no-arg constructor
	Student1(){
		System.out.println("no arg constructor");
		id=100;
		name="bindu";
		marks=200.00;
		course="jfs";
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		//note1= by default object is created with the help of default constructor.
		//note2=object is created with help of no arg constuctor.
		//whenever the class contains any other constuctor,then java complier will not create default constuctor.  
		//LHS=object reference with variable
		//RHS=constructor calling with the help of new keyword
		Student1 s1=new Student1();//object creation
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.course);
		
		
		System.out.println("main method ended");

	}

}
