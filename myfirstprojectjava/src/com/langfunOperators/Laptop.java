package com.langfunOperators;

public class Laptop {
	String brand;
	String model;
	double price;
	String color = "pink";

	Laptop() {
		this("samsug", "galaxy");
		System.out.println(" no constructor called");
	}

	Laptop(String brand, String model) {
		System.out.println("2-arg constructor called");
		this.brand = brand;
		this.model = model;
	}

	Laptop(String brand, String model, double price, String color) {
		System.out.println("parameterized constructor called");
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started from laptop");

	}
}

class Charger extends Laptop {
	Charger() {
		System.out.println("constructor called");
	}

	Charger(String brand, String model, double price, String color) {
		super(brand, model, price, color);
		System.out.println("parameterized constructor called from charger");
	}

	public static void main(String[] args) {
		System.out.println("main method started from charger");
		Charger c = new Charger();
		c.chargerInfo();
	}

	void chargerInfo() {
		System.out.println("brand:" + brand);
		System.out.println("model:" + model);
		System.out.println("price:" + price);
		System.out.println(super.color);
	}
}
