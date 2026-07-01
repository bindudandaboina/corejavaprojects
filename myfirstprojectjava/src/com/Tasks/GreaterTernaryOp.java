package com.Tasks;
import java.util.Scanner;

public class GreaterTernaryOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers:");
		
		int a=10,b=25,c=15;
		int max=(a>b)
				?((a>c)?a:c)
				:((b>c)?b:c);
		System.out.println("greater number is:"+max);
		System.out.println("enter the numbers:");
		
		int a1=29,b1=45,c1=95;
		int maximum=(a1>b1)
				?((a1>c1)?a1:c1)
				:((b1>c1)?b1:c1);
		System.out.println("greater num is:"+maximum);
		
		int x=5,y=6,z=7;
		int min=(x<y)
				?((x>y)?x:y)
				:((y>z)?y:z)	;
		System.out.println(min);
		sc.close();
		
	}

}
