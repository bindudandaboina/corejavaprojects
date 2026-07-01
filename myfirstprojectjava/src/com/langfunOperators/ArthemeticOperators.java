package com.langfunOperators;
//+ - * / %

// + Addition   --> sum     -->10+20
// - subtraction  --> Difference -->30-20=10
// * Multiplication --> Product -->10*10=100
// / division --> Reminder --> 100/10=10-->10)100(10 --> 10)1(10
// % Modulus --> Reminder--> 97%10=7 -->10)97(9 --> 7
// % -->Modulus -->Reminder --> 97%4=1

public class ArthemeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// BODMAS
		System.out.println("addition of two numbers:" + a + b);
		System.out.println("addition of two numbers:" + (a + b));
		// The operator - is undefined for the argument type(s) String, int
		System.out.println("subtraction of two numbers:" + (a - b));
		System.out.println("multiplication of two numbers:" + a * b);
		System.out.println("division of two numbers:" + a / b);
		System.out.println("modulus of two numbers:" + a % b);
		System.out.println(Math.pow(2,3));
	}

}
