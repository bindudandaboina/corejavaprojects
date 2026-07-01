package com.Lstatements;

import java.util.Scanner;

//WAP to print week days on given number
public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		switch (num) {
		case 1 ->{
		System.out.println("sunday");
		System.out.println("sunday always funday");
		}
		case 2 -> System.out.println("monday");

		case 3 -> System.out.println("tuesday");

		case 4 -> System.out.println("wednesday");

		case 5 -> System.out.println("thrusday");

		case 6 -> System.out.println("friday");
		case 7 -> System.out.println("saturday");
		default -> System.out.println("Invalid entry");

		}

	}

}
