package com.LStatementsLoops;
//WAP to print the even or odd numbers
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("enter even number");
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println( );
		
		System.out.println("enter odd number");
		for(int a=1;a<=100;a++) {
			if(a%2==1) {
				System.out.print(a+" ");
			}
		}

	}

}
