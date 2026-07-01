package com.Tasks;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a movie name:");
		String movie=sc.next();
		System.out.println("enter the movie categorie:");
		char categorie=sc.next().charAt(0);
		
		
		switch (categorie) {
		case 'g'|'G': {
			System.out.println(150);
			System.out.println("its a good movie");
			break;
		}
		case 'p'|'P': {
			System.out.println(250);
			System.out.println("its too clear picture");
			break;
		}
		case 'v'|'V': {
			System.out.println(400);
			System.out.println("better benifits");
			break;

		}
		default:
			System.out.println("movie not played");

		}

	}

}
