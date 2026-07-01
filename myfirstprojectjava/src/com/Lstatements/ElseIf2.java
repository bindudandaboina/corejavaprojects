package com.Lstatements;
import java.util.Scanner;
public class ElseIf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		if(age>=0&&age<5) {
			System.out.println("kids");
		}else if(age>=5 && age<12) {
			System.out.println("childrens");
		}else if(age>=13&&age<19) {
			System.out.println("teen age");
		}else if(age>=19&&age<35) {
			System.out.println("young people");
		}else if(age>=35&&age<60) {
			System.out.println("middle age");
		}else if(age>60) {
			System.out.println("senior citizens");
		}
		

	}

}
