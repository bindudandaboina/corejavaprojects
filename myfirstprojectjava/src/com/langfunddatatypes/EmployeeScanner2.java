package com.langfunddatatypes;
import java.util.Scanner;
//with arguments without return type using scanner

public class EmployeeScanner2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeScanner2 e=new EmployeeScanner2();
		
		System.out.println("enter company name:");
		String compName=sc.nextLine();
		
		System.out.println("enter employee name:");
		String empName=sc.next();
		
		System.out.println("enter employee age:");
		int empAge=sc.nextInt();
		
		System.out.println("enter employee gender:");
		String empGen=sc.next();
		
		System.out.println("enter employee salary");
		double empSal=sc.nextDouble();
		
		System.out.println("enter employee performance");
		String empPerf=sc.next();
		e.getcompName(compName);
		e.getempName(empName);
		e.getempAge(empAge);
		e.getempGen(empGen);
		e.getempSal(empSal);
		e.getempPerf(empPerf);
		sc.close();
		

		
	}
	void getcompName(String compName ) {
		System.out.println("enter a company name:"+compName);
	}
	void getempName(String empName) {
		System.out.println("enter a employee name:"+empName);
	}
	void getempAge(int empAge) {
		System.out.println("enter a employee age:"+empAge);
	}
	void getempGen(String empGen) {
		System.out.println("enter a employee gender:"+empGen);
	}
	void getempSal(double empSal) {
		System.out.println("enter a employee salary:"+empSal);
	} 
	void getempPerf(String empPerf) {
		System.out.println("enter a employee performance:"+empPerf);
		
	}

}
