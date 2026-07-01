package com.LStatementsLoops;
//WAP to find the given number is perfect or not?
//perfect number:the given number is equals to sum of its factory which excludes the given number is perfect or not.
//input  is :6-->1+2+3=6-->true
//input is :19-->1+2+5=8-->false

import java.util.Scanner;

public class PerfectNumber {
	static boolean FindPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		boolean status = FindPerfect(a);
		if (status) {
			System.out.println("the given number is perfect");

		} else {
			System.out.println("the given number is not perfect");
		}

	}

}
