package com.Tasks;
import java.util.Scanner;

public class FiveEvenNumbersWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		int count=0;
		System.out.println("enter the integers");
		while(count<5) {
			number=sc.nextInt();
			if(number%2==0) {
				count++;
				System.out.println(number+" It is the even number");
			}else {
				System.out.println(number+" it is the odd number");
			}
		}
		System.out.println("five even numbers have been entered");

	}

}
