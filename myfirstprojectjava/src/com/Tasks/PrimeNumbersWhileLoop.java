package com.Tasks;

import java.util.Scanner;

public class PrimeNumbersWhileLoop {

	public static void main(String[] args) {
		System.out.println("enter the starting range");

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("enter the ending range");
		int n = sc.nextInt();

		for (int i = m; i < n; i++) {
			System.out.println(i + " ");
		}

	}

}
