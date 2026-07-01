package com.Tasks;
import java.util.Scanner;

public class CharacterOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower case letters");
		char ch=sc.next().charAt(0);
		
		String result=(ch>='a'&&ch<='z')
				?"Lowercase alphabet"
				:"not a lowercase alphabet"	;
		System.out.println(result);
		
		String result2=(ch>='A'&&ch<='Z')
				?"uppercase alphabet"
						:"not a uppercase alphabet";
		System.out.println(result2);
		
		
		sc.close();
			}

}
