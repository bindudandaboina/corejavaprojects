package com.langfunddatatypes;
//with arguments with return type[

import java.util.Scanner;

public class TypesofMethodsDemo3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		TypesofMethodsDemo3 t = new TypesofMethodsDemo3();
		double salary = t.getSalary();
		double bonus = t.getBonus();
		double gst = t.getGst();
		System.out.println("total salary:" + (salary + bonus + gst));
		System.out.println("main method ended");

	}

	double getSalary() {
		System.out.println("enter the salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	double getBonus() {
		System.out.println("enter the bonus:");
		double bonus = sc.nextDouble();
		return bonus;
	}

	double getGst() {
		System.out.println("enter the gst:");
		double gst = sc.nextDouble();
		return gst;
	}

}
