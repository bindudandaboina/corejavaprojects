package com.langconstructors;

public class Laptop {
	String name;
	double price;
	String model;
	String colour;

	Laptop(String name, String colour) {
		this.name = name;
		this.colour = colour;
		System.out.println("parameterizied constructor");
	}

	public Laptop() {
		name = "unknown";
		price = 0.0;
		model = "unknown";
		colour = "unknown";

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Laptop l = new Laptop();
		l.laptopInfo();
		Laptop l1 = new Laptop("lenovo", "white");
		l1.laptopInfo();
	}

	void laptopInfo() {
		System.out.println("name:" + name);
		System.out.println("price:" + price);
		System.out.println("model:" + model);
		System.out.println("colour:" + colour);
	}

}
