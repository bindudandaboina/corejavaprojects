package com.LStatementsLoops;

//WAP to print sum of 0 to 10 numbers
public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}

		System.out.println("given the number  0 to 10:" + sum);

	}

}
