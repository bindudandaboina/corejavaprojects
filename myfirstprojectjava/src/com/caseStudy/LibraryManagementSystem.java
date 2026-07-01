package com.caseStudy;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have library card?(yes/no)");
		String card = sc.next();
		if (card.equalsIgnoreCase("yes")) {
			System.out.println("enter no.of books already borrowed");
			int books = sc.nextInt();
			if (books >= 3) {
				System.out.println("borrowing limit reached,you cannot borrow another book:");
			} else {
				System.out.println("select book category");
				System.out.println("1->fiction");
				System.out.println("2->science");
				System.out.println("3->history");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("fiction:borrowing period is 7 days");
					break;
				case 2:
					System.out.println("science:borrowing period is 14 days");
					break;
				case 3:
					System.out.println("history:borrowing period is 21 days");
				default:
					System.out.println("invalid category");

				}

			}
		} else {
			System.out.println("library card required to borrow books");

		}
		sc.close();
	}

}
