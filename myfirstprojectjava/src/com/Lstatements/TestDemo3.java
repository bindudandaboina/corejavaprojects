package com.Lstatements;
import java.util.Scanner;
public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method  started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your marks% for like Thenth inter btech");
		System.out.println("enter Thenth%");
		double thenthMarksP=sc.nextDouble();
		
		System.out.println("enter inter%");
		double interMarksP=sc.nextDouble();
		
		System.out.println("enter btech%");
		double btechMarksP=sc.nextDouble();
		
		if(thenthMarksP>=60&&interMarksP>=79&&btechMarksP>=85) {
			System.out.println("you are eligible for mnc oragnization placemnets");
		}
		else {
			System.out.println("dont give up");
		}
		

	}

}
