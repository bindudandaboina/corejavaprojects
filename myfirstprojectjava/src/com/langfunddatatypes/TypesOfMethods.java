package com.langfunddatatypes;
import java.util.Scanner;
class Student{
	int id;
	String name;
	double marks;
	float height;
	String address;
	long number;
	char gender;
	String course;
	double weight;
	int age;
	float rating;
	char grade;
	long adharnbr;
	long pannbr;
	
}

public class TypesOfMethods {
	
		Student getStudent() {
			Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("enter student id:");
		s.id=sc.nextInt();
		System.out.println("enter student name:");
		s.name=sc.next();
		System.out.println("enter student marks:");
		s.marks=sc.nextDouble();
		System.out.println("enter student height:");
		s.height=sc.nextFloat();
		System.out.println("enter student address:");
		s.address=sc.nextLine();
		System.out.println("enter student number:");
		s.number=sc.nextLong();
		System.out.println("enter student gender:");
		s.gender=sc.next().charAt(0);
		System.out.println("enter student course:");
		s.course=sc.next();
		System.out.println("enter student weight:");
		s.weight=sc.nextDouble();
		System.out.println("enter student age:");
		s.age=sc.nextInt();
		System.out.println("enter student rating:");
		s.rating=sc.nextFloat();
		System.out.println("enter student grade:");
		s.grade=sc.next().charAt(0);
		return s;
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		TypesOfMethods t=new TypesOfMethods();
		Student s=t.getStudent();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.height);
		System.out.println(s.address);
		System.out.println(s.number);
		System.out.println(s.gender);
		System.out.println(s.course);
		System.out.println(s.weight);
		System.out.println(s.age);
		System.out.println(s.rating);
		System.out.println(s.grade);
		System.out.println("main method ended");
	}

}
