package com.langfunOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=20;
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(false&&true);//false//dead code
		System.out.println(false&&false);//false-->dead code
		
		
		System.out.println("**********************");
		
		System.out.println(a>b&&a==c);//false
		System.out.println(a<b&&a==c);//false
		System.out.println(a<b&&a!=c);//true
		System.out.println(a>b&&++a>b);//false
		
		System.out.println("****************************");
		System.out.println(true||true);//true-->dead code
		System.out.println(true||false);//true
		System.out.println(false||true);//true
		System.out.println(false||false);//false
		
		System.out.println(a<b || a==c);//true
		System.out.println(a>b || a!=c);//true
		System.out.println(a>b || a==c);//false
		
		System.out.println("************************");
		System.out.println(!true);//false
		System.out.println(!(a>b));//true

	}

}
