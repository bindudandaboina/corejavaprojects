package com.Lstatements;
import java.util.Scanner;
//wap to check age aligibility for driving & voting

public class TestDemo1 {

	 void main() {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("welcome to india");
			System.out.println("you are eligible for voting&driving");
		}else { 
			System.out.println("not eligible");
			System.out.println("welcomee");
			System.out.println("main method ended");
		
		}
		
		
	}

}
