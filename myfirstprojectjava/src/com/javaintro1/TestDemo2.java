package com.javaintro1;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method stated");
		m1();
		System.out.println("main method ended");
		
		
	}
	public static void m1() {
		System.out.println("m1 called");
		TestDemo2 t = new  TestDemo2();
		t.m2();
		
	}
	void m2() {
		System.out.println("m2 called");
		m3();
	}
	void m3() {
		System.out.println("m3 called");
		m4();
	}
	public static  void m4() {
		System.out.println("m4 called");
		TestDemo2 t = new  TestDemo2();
		t.m5();
		
	}
	void  m5() {
		System.out.println("m5 called");
		
		
	}
	
}
