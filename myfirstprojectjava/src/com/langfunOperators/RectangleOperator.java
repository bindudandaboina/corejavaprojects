package com.langfunOperators;

import java.util.Scanner;

public class RectangleOperator {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter l:");
		double l = sc.nextDouble();
		System.out.println("enter w:");
		double w = sc.nextDouble();

		double area = l * w;
		double perimeter = 2 * (l + w);

		System.out.println("enter rectangle=" + area);
		System.out.println(" perimeter of reactangle=" + perimeter);
		sc.close();
	}

}
