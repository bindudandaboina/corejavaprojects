package com.javaintro1;

public class TestDemo3 {
	static {
		System.out.println("static block1");
		TestDemo3 t = new TestDemo3();

	}
	static {
		System.out.println("static block2");
		TestDemo3 t = new TestDemo3();
	}

	{
		System.out.println("instance block1");
	}
	{
		System.out.println("instance block2");
	}
	{
		System.out.println("instance block3");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

	}

}
