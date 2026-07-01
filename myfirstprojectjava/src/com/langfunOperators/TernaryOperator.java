package com.langfunOperators;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=20;
		int max=(a>b)?a:b;
		System.out.println("max value from given number:"+max);
		System.out.println("enter the age:");

		int age=sc.nextInt();
		String eligibility=(age>18)?"yes":"no";
		System.out.println("this person eligible for driving:"+eligibility);
		sc.close();
	}

}
