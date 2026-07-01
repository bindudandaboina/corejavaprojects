package com.langfunOperators;

public class SwapDemo {

	public static void main(String[] args) {
		int a = 20;
		int b = 38;

		// int temp=a;
		// a=b;
		// b=a;

		// a=a+b;//30
		// b=a-b;//10
		// =a-b;//20

		// a=a^b;//30
		// b=a^b;//10
		// a=a^b;//20

		a = a & b;// 4
		b = a & b;// 4

		System.out.println("A value is:" + a);// 10
		System.out.println("B value is:" + b);// 20
	}

}
