package com.projects;

import java.util.Scanner;

//Nested Switch case
//simple POC which is related to vegetable market information? 
public class NestedSwitchCase {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		char repeat;
		int totalBill = 0;

		do {

			System.out.println("enter a category");
			String catg = sc.next();

			switch (catg) {
			case "veg" -> {
				System.out.println("enter item:");
				String item = sc.next();
				System.out.println("enter quantity");
				int qty = sc.nextInt();
				switch (item) {
				case "tmt" -> {
					int price = 50;
					totalBill += price * qty;

					System.out.println("tomato added.price=rps" + (price * qty));
				}
				case "ptt" ->

				{

					int price = 60;
					totalBill += price * qty;
					System.out.println("potato added.price=rps" + (price * qty));
				}
				case "drm" -> {

					int price = 20;
					totalBill += price * qty;

					System.out.println("drumsticks added.price=rps" + (price * qty));
				}
				case "mrc" -> {

					int price = 40;
					totalBill += price * qty;
					System.out.println("mirchi added.price=rps" + (price * qty));
				}
				default -> System.out.println("entered item is out of stock!");
				}
				// -------FRUITS-------

			}
			case "fru" -> {
				System.out.println("enter fruit item");
				String item = sc.next();
				System.out.println("enter quantity:");
				int qty = sc.nextInt();

				switch (item) {
				case "mng" -> {

					int price = 80;
					totalBill += price * qty;
					System.out.println("mango added.price=rps" + (price * qty));
				}
				case "apple" -> {

					int price = 100;
					totalBill += price * qty;
					System.out.println("apple added.price=rps" + (price * qty));
				}
				case "orange" -> {

					int price = 80;
					totalBill += price * qty;
					System.out.println("orange added.price=rps" + (price * qty));
				}
				case "grapes" -> {

					int price = 20;
					totalBill += price * qty;

					System.out.println("grapes added.price=rps" + (price * qty));
				}
				default -> System.out.println("fruits are not available");
				}
			}
			default -> System.out.println("entered category is not available");
			}
			System.out.println("Do you want to continue?(y/n):");
			repeat = sc.next().charAt(0);

		} while (repeat == 'y' || repeat == 'Y');
		System.out.println("total bill=rps" + totalBill);
		System.out.println("thank you");
		sc.close();

	}
}
