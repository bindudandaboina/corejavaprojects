package com.langfunddatatypes;
import java.util.Scanner;

public class DataTypesDemo4 {
	class Student{
		int studentId;
		String studentName;
		double Marks;
		String collegeName;
		}
	

	//no arguments no return type
	public static void welcome() {
		System.out.println("welcome to methods");
	}
	static void getCollegeName(String name) {
		System.out.println("enter the college name:"+name);
		
	}
	static void displayTotalStudentsCount() {
		int count=45;
		System.out.println("total students:"+count);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		DataTypesDemo4 d=new DataTypesDemo4();
		welcome();
		
		d.setStudentId(101);
		d.setStudentName("bindu");
		d.setStudentMarks(79.00);
		getCollegeName("dandaboina");
		displayTotalStudentsCount();
		
		double marks=d.getMarks();
		System.out.println("student marks:"+marks);
		
		double bonus=d.getBonusMarks(15);
		System.out.println("BonusMarks():"+bonus);
		

	}
	//arguments with no return type
	void main() {
		System.out.println("enter student details");
		
	}
	void setStudentId(int id) {
		System.out.println("student id:"+id);
	}
	void setStudentName(String name) {
		System.out.println("student name:"+name);
	}
	void setStudentMarks(double marks) {
		System.out.println("student marks:"+marks);
	}
	double getMarks() {
	return 99.00;
	}
	//with arguments with return type
 double getBonusMarks(int bonus) {
	 System.out.println("enter the bonus:"+bonus);
	 Scanner sc=new Scanner(System.in);
	 	 double extraBonus = sc.nextDouble();
	 return bonus+extraBonus;
			
}
	
}
