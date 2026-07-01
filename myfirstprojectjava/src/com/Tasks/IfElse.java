package com.Tasks;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year:");
		int year=sc.nextInt();
		if((year%4==0&&year%100!=0)||(year%200==0)){
			System.out.println("is a leap year");
			
		}
		else {
			System.out.println("not a leap year");
		}
			}

}
