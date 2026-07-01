package com.langfund;

public class TypesofDataTypes {
	void addition() {
		int a=10;
		int b=98;
		System.out.println("addition of two numbers:"+a+b);
	}
	void subtraction()
	{
		float a=10;
		float b=30;
		System.out.println("subtraction of two numbers:"+(a-b));
	}
	void multiplication() {
		double a=10.5;
		double b=34.2;
		System.out.println("multiplication of two numbers:"+(a*b));
	}
	void division() {
		long l1=33;
		long l2=21;
		System.out.println("division of two numbers:"+33/21);
	}
	void modulo() {
		long l1=55;
		long l2=4;
		System.out.println("modulo of two numbers:"+55%4);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TypesofDataTypes t1=new TypesofDataTypes();
		
		t1.addition();
		t1.subtraction();
		t1.multiplication();
		t1.division();
		t1.modulo();
	}

}
