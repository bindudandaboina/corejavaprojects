package com.javaintro.garbage1;

class Student1 {
	
	int sid;
	String sname;
	
}
//Driver class 

public class Student {
	
	 void main() {

		System.out.println("main method started");
		
		Student1 obj=new Student1();
		obj.sid=10;
		obj.sname="bindu";
		System.out.println(obj.sid);
		System.out.println(obj.sname);
		
		
	}

}
