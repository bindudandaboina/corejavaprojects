package com.Tasks;

import java.util.Scanner;

public class ForLoopNaturalnbrs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a N number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println("sum:" + sum);
	}

}
