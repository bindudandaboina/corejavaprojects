package com.langconstructors;

public class Car {
	int carnbr;
	String brand;
	String model;
	String colour;
	

	public Car(int carnbr, String brand, String model, String colour) {
		
		this.carnbr = carnbr;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
	}
	Car(){
		System.out.println("no arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Car c=new Car(1243,"toyota","innova crysta","white");
		c.carInfo();
		Car c1=new Car();
		c1.carInfo();
		System.out.println("main method ended");
	}
	void carInfo() {
		System.out.println("carnbr:"+carnbr);
		System.out.println("car brand:"+brand);
		System.out.println("car model:"+model);
		System.out.println("car colour:"+colour);
	}

}
