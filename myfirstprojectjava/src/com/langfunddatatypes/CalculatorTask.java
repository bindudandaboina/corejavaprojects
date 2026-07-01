package com.langfunddatatypes;

import java.util.Scanner;

public class CalculatorTask {
	Scanner sc = new Scanner(System.in);

	// add
	void add() {
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("addition=" + (a + b));
	}

	// add (int a,int b)
	void add(int a, int b) {
		System.out.println("addition=" + (a + b));

	}

	// add(int a,int b, int c)
	void add(int a, int b, int c) {
		System.out.println("addition=" + (a + b + c));
	}

//subract the two numbers
	void subtract() {
		System.out.println("enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("subtraction=" + (a - b));
	}

	// subtract(int a,int b)
	void subtract(int a, int b) {
		System.out.println("subtraction=" + (a - b));

	}

	// subtract(int a,int b,int c)
	void subtract(int a, int b, int c) {
		System.out.println("subtraction=" + (a - b - c));
	}

	// multiply the two numbers
	void multiply() {
		System.out.println("enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("multiply=" + (a * b));
	}

	// multiply(int a,int b)
	void multiply(int a, int b) {
		System.out.println("multiply=" + (a * b));

	}

	void multiply(int a, int b, int c) {
		System.out.println("multiply=" + (a * b * c));
	}

	// division
	void division() {
		System.out.println("enter the two values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b != 0) {
			System.out.println("divided =" + (double) a / b);

		} else {
			System.out.println("cannot divided by zero");

		}

	}

	void division(int a, int b) {
		if (b != 0) {
			System.out.println("divided=" + (double) a / b);
		} else {
			System.out.println("cannot divided by zero");
		}

	}

	public static void main(String[] args) {
		CalculatorTask c = new CalculatorTask();
		c.add();
		c.add(5, 6);
		c.add(2, 3, 4);

		c.subtract();
		c.subtract(12, 8);
		c.subtract(55, 87, 43);

		c.multiply();
		c.multiply(12, 3);
		c.multiply(12, 3, 4);

		c.division();
		c.division(12, 3);

	}

}
