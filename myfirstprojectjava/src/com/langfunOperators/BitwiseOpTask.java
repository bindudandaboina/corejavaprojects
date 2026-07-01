package com.langfunOperators;

public class BitwiseOpTask {

	public static void main(String[] args) {
		
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
		System.out.println(10&12);//8
		System.out.println(73&18);//0
		System.out.println(32&45);//32
		System.out.println("**************");
		
		
		System.out.println(true|true);//true
		System.out.println(true|false);//true
		System.out.println(false|true);//true
		System.out.println(false|false);//false
		System.out.println(10|12);//14
		System.out.println(73|18);//91
		System.out.println(32|45);//45

		
		System.out.println("******************");
		System.out.println(true^true);//false
		System.out.println(true^false);//true
		System.out.println(false^true);//true
		System.out.println(false^false);//false
		System.out.println(10^12);//6
		System.out.println(73^18);//91
		System.out.println(32^45);//13
		System.out.println("***************");
		System.out.println(~5);//-(n+1)-->-6
		System.out.println(~879);//-(n+1)-->-880
		int a=12;
		int b=5;
		System.out.println(~a);//-13
		System.out.println(~b);//-6
		System.out.println("**************************");
		
		System.out.println(a>>b);
		System.out.println(a<<b);//384
		
		int a1=23;
		int b1=3;
		System.out.println(a1>>b1);
		System.out.println(a1<<b1);
		
		

		
	}

}
