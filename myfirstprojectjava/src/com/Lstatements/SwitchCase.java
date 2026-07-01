package com.Lstatements;
import java.util.Scanner;
//whenevr we want to represent some statements or logic based pn your inpout value then will go for switch cases
//WAP to print cricketer description based on jersy number..?
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter jersey number:");
		int jno=sc.nextInt();
		switch(jno) {
		case 7:
			System.out.println("ms dhoni");
			System.out.println("right hand batman+wicket keeping");
			break;
		case 18:
			System.out.println("virat kohil");
			System.out.println("run machine");
			break;
		case 45:
			System.out.println("rohit sharma");
			System.out.println("hitman");
			break;
		default :
			System.out.println("jno not played today!");
		}
		
	}

}
