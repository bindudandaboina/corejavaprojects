package com.langfunOperators;

public class UnaryOperatorsDemo {

	public static void main(String[] args) {
		double a= 0.5;
		
		System.out.println(a++);//0.5
		System.out.println(a);//1.5
		
		int d = 10;
		d=d++;
		System.out.println(d);//10
		System.out.println(d++);//10
		int c=11;
		int e=++c;
		System.out.println(c);
		System.out.println(++c);
	}

}
