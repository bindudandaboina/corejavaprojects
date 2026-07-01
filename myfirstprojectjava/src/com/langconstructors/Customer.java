package com.langconstructors;

public class Customer {
	int cid;
	String name;
	int age;
	char gen;

	Customer() {
		this(100, "unknown");// no arg constructor calling 2-arg constuctor
		System.out.println("no arg constuctor");
	}

	public Customer(int cid, String name) {
		this(cid, name, 10);// calling 3-arg constuctor in 2-arg constructor
	}

	public Customer(int cid, String name, int age) {
		this.cid = cid;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Customer c = new Customer();
		c.cusInfo();
		Customer c1 = new Customer(101, "bindu");
		c1.cusInfo();
		Customer c2 = new Customer(102, "bhumi", 21);
		c2.cusInfo();

		Customer c3 = new Customer(103, "srija", 18);
		c3.cusInfo();

		System.out.println("main method ended");

	}

	
	void cusInfo() {
		System.out.println("cid:" + cid);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("gen:" + gen);
		System.out.println("------------------------");
	}

}
