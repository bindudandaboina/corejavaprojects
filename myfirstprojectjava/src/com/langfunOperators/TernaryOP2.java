package com.langfunOperators;
import java.util.Scanner;

public class TernaryOP2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int a=25;
		int b=55;
		int min=(a<b)?a:b;
		System.out.println("print the min value:"+min);
		//find even or odd values
				int num=5;
		String result=(num%2==0)?"even":"odd";
		System.out.println("print the values "+result);
		//find positive or negative values
		int n=15;
		String result1=(n>=0)?"positive":"negative";
		System.out.println("print the value:"+result1);
		//find pass or fail
		int marks=75;
		String result2=(marks>86)?"pass":"fail";
		System.out.println(result2);
		
}

}
