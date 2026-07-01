package com.langconstructors;

//parent or super base
class Product {
	int id = 0;
	String name = "unknown";
	double price = 0.0;
	String orgName = "bindu";


	// String orgName="bindu";
	public static void main(String[] args) {
		System.out.println("main method started from product");

	}

}
// child or sub or derived

public class Mobile1 extends Product {
	int id = 110;
	String name = "moto";
	double price = 500000.0;
	//String orgName = "bindu";

	public static void main(String[] args) {
		System.out.println("main method started from mobile1");
		Mobile1 m = new Mobile1();
		m.mobile1Info();
	}

	void mobile1Info() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(super.orgName);
	}

}
