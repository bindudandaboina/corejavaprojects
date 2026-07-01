package com.langfunddatatypes;
//with arguments no return type

public class StudentInfo {

	 void main() {
		 System.out.println("Student details!");
		 getStudentName("Bindu");
		 getAge(21);
		 feeInfo(27000);
		 heightAndweight(5.9f,45);
		 getMarks(95);
		 getStudentId(101);
		 address("warangal");
		 course("java full stack");
		 rank(5);
		 lastName("Dandaboina");
		 gender('f');
		 phonenumber(9977368229l);
		 
	 } 
		 void getStudentName(String Name) {
			 System.out.println("Student Name:"+ Name);
		 }
		 void getAge(int age) {
			 System.out.println("Student Age is:"+ age);
		 }
		 void feeInfo(double fee) {
			 System.out.println("Student Fee is:"+ fee);
		 }
		 void heightAndweight(float H,double W) {
			 System.out.println("Student Height is:"+ H);
			 System.out.println("Student Weight is:"+ W);
		 }
		 void getMarks(int marks) {
			 System.out.println("Student Marks is:"+ marks);
		 }
		 void getStudentId(int id) {
			 System.out.println("Student Id is:"+id);
		 }
		 void address(String address) {
			 System.out.println("Student Address is:"+address);
		 }
		 void course(String course) {
			 System.out.println("Student Course :"+course);
		 }
		 void rank(int rank) {
			 System.out.println("Student Rank:"+rank);
		 }
		 void lastName(String name) {
			 System.out.println("Student LastName:"+name);
		 }
		 void gender(int gender) {
			 System.out.println("Student Gender :"+gender);
			 }
		 void phonenumber(double phonenumber) {
			 System.out.println("Student phonenumber:"+phonenumber);
		 }
		 }


