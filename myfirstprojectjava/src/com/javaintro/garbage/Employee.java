package com.javaintro.garbage;

class Employee { 
	
	int empid;
	String empname;
	 @Override
       protected void finalize() throws Throwable {
	
		System.out.println("finalize method called");
		
	}


  public class TestEmployee {
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Employee e1=new Employee();
		Employee e2=new Employee();

		
		System.out.println(e1);
		System.out.println(e2);
//		Runs the garbage collector in the Java Virtual Machine.
		System.gc();
//		1.nullifying the objects
		
			e1=null;
			e2=null;
		
//	2.re-assigining the objects
			
		Employee e3=new Employee();
		
		System.out.println("e3");
		
		e3=e2; 
		
		System.out.println("main method ended");

	}
	
  }

}
