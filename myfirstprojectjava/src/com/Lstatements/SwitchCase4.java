package com.Lstatements;

import java.util.Scanner;
//WAP to print calculation based on given numbers&based on arithmetic operators

public class SwitchCase4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;
		do {
			 yn =sc.next();
			System.out.println("enter a number");
			int a = sc.nextInt();
			System.out.println("enter another number");
			int a1 = sc.nextInt();
			System.out.println("enter a symbol:");
			String symb = sc.next();
			double result = 0;
			switch (symb) {
			case "+" -> result = a + a1;
			case "-" -> result = a - a1;
			case "*" -> result = a * a1;
			case "%" -> result = a % a1;
			case "/" -> result = a / a1;
			default -> System.out.println("Invalid symbol");
			}
			System.out.println("the result value is:" + result);
			System.out.println("do you want to continue..?click Y for yes or N for no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("exit");
		System.out.println("main method ended");

	}

}
