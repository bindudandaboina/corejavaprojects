package com.javaintro1;

public class Javaintro {
	public static void Welcome() {
		System.out.println("welcome to java world");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		Welcome();
		Javaintro j=new Javaintro();
		j.hello();
	}
	void hello() {
		System.out.println("good evening");
		System.out.println("main method ended");
	}

}
