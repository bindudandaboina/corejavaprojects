package com.langfunddatatypes;
//with arguments no return type

import java.util.Scanner;

public class StudentScanner {

	public static void main(String[] args) {
		System.out.println("welcome to vcube organization");
		
		Scanner sc = new Scanner(System.in);
		
		StudentScanner s = new StudentScanner();

		System.out.println("enter organization name:");
		String orgName = sc.nextLine();

		System.out.println("enter employee salary:");
		double sal = sc.nextDouble();
		sc.nextLine();

		System.out.println("enter employee city:");
		String city = sc.nextLine();

		System.out.println("enter employee id:");
		int id = sc.nextInt();
		System.out.println("enter employee height :");
		float h=sc.nextFloat();
		System.out.println("enter employee weight:");
		double w=sc.nextDouble();
		System.out.println("enter phoneNumber is:");
		long p=sc.nextLong();
		System.out.println("enter emp fullName:");
		String name=sc.nextLine();
		System.out.println("enter emp country:");
		String c=sc.nextLine();
		System.out.println("enter emp marks:");
		int m=sc.nextInt();
		System.out.println("enter emp age:");
		int a=sc.nextInt();
		System.out.println("enter emp percentage:");
		float per=sc.nextFloat();
		System.out.println("enter emp balance:");
		double b=sc.nextDouble();
		System.out.println("enter emp adhar");
		long adhar=sc.nextLong();
		System.out.println("enter emp gender");
		char gen=sc.next().charAt( 0);

		s.getOrgName(orgName);
		s.getEmpSalInfo(sal);
		s.getEmpCurrentCity(city);
		s.getEmpId(id);
		s.heightAndweight(h,w);
		s.phoneNumber(p);
		s.getempCountry(c);
		s.getempMarks(m);
		s.getempAge(a);
		s.getempPercentage(per);
		s.getempBalance(b);
		s.getempAdharnbr(adhar);
		s.getempGender(gen);
		sc.close();
	}

	void getOrgName(String orgName) {
		System.out.println("Organization name:" + orgName);

	}

	void getEmpSalInfo(double sal) {
		System.out.println("Employee salary is:" + sal);
	}

	void getEmpCurrentCity(String city) {
		System.out.println("Current city is:" + city);

	}

	void getEmpId(int id) {
		System.out.println("Employee id is:" + id);

	}
	void heightAndweight( float h,double w){
		System.out.println("employee height is:"+h);
		System.out.println("employee weight is:"+w);
		
		
	}
	void phoneNumber(long p) {
		System.out.println("employee phoneNumber is:"+p);
	}
	void getempName(String n) {
		System.out.println("employee fullName:"+n);
	}
	void getempCountry(String c) {
		System.out.println("employee country:"+c);
	}
	void getempMarks(int m) {
		System.out.println("employee marks:"+m);
	}
	void getempAge(int a) {
		System.out.println("employee age:"+a);
	}
	void getempPercentage(float per) {
		System.out.println("employee percentage:"+per);
	}
	void getempBalance(double b) {
		System.out.println("employee balance:"+b);
	}
	void getempAdharnbr(long adhar) {
		System.out.println("employee adhar:"+adhar);
	}
	void getempGender(char gen) {
		System.out.println("emloyee gender:"+gen);
	}
}