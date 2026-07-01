package com.langconstructors;
//no arg constructor
//2-parameterized constructor
//4-parameterized constructor
//constuctor with different arguments like 2-arg,4-arg in one class will consider as constructor overloading

public class Bike {
	String brand;
	String model;
	double price;
	double milage;
		
	//no arg constuctor
	Bike() {
		System.out.println("no arg constructor");
		brand = "hero";
		model = "splender plus";
		price = 85000.00;
		milage = 60;
			}
	//parameterized constructor
	//this keyword is invoked
	//we need to keep this keyword for a better readability,maintenance,flexibility.

	Bike(String brand,String model,double price,double milage){
		System.out.println(" 4-arg parameterized constructor called");
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.milage=milage;
			}
	
	//even though if we keep ,different names for arguments,it works but its not better way of coding.
	//we should follow coding ethics,thats why arguments&instatnce variables must be same and we need to call with "this" keyword.
	Bike(String brand,String model){
		System.out.println("2-arg parameterized constructor called");
		this.brand=brand;
		this.model=model;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
				Bike b = new Bike();
		b.BikeInfo();
		Bike b1 = new Bike( "honda", "shine 125", 80000.00,  55);
		b1.BikeInfo();
		Bike b2=new Bike("honda","shine 125");
		b2.BikeInfo();

		System.out.println("main method ended");

	}

	void BikeInfo() {
		System.out.println("bike brand:" + brand);
		System.out.println("bike model:" + model);
		System.out.println("bike price:" + price);
		System.out.println("bike milage:" + milage);

	}

}
