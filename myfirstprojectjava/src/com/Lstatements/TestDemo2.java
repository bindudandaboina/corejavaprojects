package com.Lstatements;

//wap print weather the give nbr id even or odd & positive or negitive
import java.util.Scanner;

public class TestDemo2 {

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started");
		// WAP based on positive or negitive

		System.out.println("enter a number");

		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("number is negitive:" + number);
		} else {
			System.out.println("number is positive:" + number);
		}
//wop give the even or odd numbers
		if(number%2==0){
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
			
		}
	}

}
