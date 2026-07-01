package com.Tasks;

import java.util.Scanner;

public class TaskElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character:");
		char ch = sc.next().charAt(0);
		// if (ch >= 'A' && ch <= 'Z') {
		// System.out.println("It is a upper case letter");
		// } else if (ch >= 'a' && ch <= 'z') {
		//System.out.println("It is a lower case letter");
		// } else if (ch >= 0 && ch <= 9) {
		//System.out.println("It is a digit");
		// } else {
		// System.out.println("It is a special character");
		// }
//
		int ascii = (int) ch;
		if (ascii >= 65 && ascii <= 90) {
			System.out.println("It is a uppercase letter");
		} else if (ascii >= 97 && ascii <= 122) {
			System.out.println("It is a lower case letter");
		} else if (ascii >= 48 && ascii <= 57) {
			System.out.println("it is a digit");

		} else {
			System.out.println("special character");
		}
	}

}
