package com.LStatementsLoops;

import java.util.Scanner;

public class FactorialNumber {
	static int findFact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		// int n = sc.nextInt();
		// int fact = 1;
		// for (int i = n; i >= 1; i--) {

		// long n=sc.nextLong();
		// long fact=1;
		// for(long i=n;i>=1;i--) {
		// fact = fact * i;
		// }
		// System.out.println("factorial of a given number is:" + fact);

		// }

//}
		int n = sc.nextInt();
		int factorial = findFact(n);
		System.out.println("factorial of a given number is:" + factorial);
		sc.close();
	}
}
