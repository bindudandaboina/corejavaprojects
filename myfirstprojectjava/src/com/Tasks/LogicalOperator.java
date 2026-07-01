package com.Tasks;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=12;
		int b=15;
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false
		System.out.println(false&&false);//false
		
	 	System.out.println(a>b&&a==b);//false
		System.out.println(a<b&&a!=b);//true
		System.out.println(a>b&&a!=b);//false
		System.out.println(++a<b&&a!=b);//true
		System.out.println(a>b&&--a<b);//false
		
		System.out.println("**************");
		
		System.out.println(a>b||a==b);//false
		System.out.println(a<b||a!=b);//true
		System.out.println(a>b||a!=b);//true
		System.out.println(++a<b||a!=b);//true
		System.out.println(a>b||--a<b);//true
		System.out.println("**********************");
		
		System.out.println(!true);
		System.out.println(!(false));
		

	}

}
