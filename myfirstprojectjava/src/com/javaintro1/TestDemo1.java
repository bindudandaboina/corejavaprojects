package com.javaintro1;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		m1();
//		if you want to call instance method in static area we want to create object.
		TestDemo1 t = new TestDemo1();
		t.m2();
		System.out.println("main method ended");

	}

	public static void m1() {
		System.out.println("m1 called");
	}

// 	 In instance,we can call instance directly.
	void m2() {
		m3();
		System.out.println("m2 called");

	}

// 	 in instance we can call static directly
	void m3() {
		m4();
		System.out.println("m3 called");
	}

// 	 In static, we cannot call instance method,we want to create object.
	public static void m4() {
		TestDemo1 t = new TestDemo1();

		t.m5();
		System.out.println("m4 called");
	}

	void m5() {
		System.out.println("m5 called");
	}

}
