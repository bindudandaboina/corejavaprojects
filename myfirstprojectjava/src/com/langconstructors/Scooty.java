package com.langconstructors;

public class Scooty {
	String brand;
	String model;
	String colour;
	double price;
	double mileage;
	Scooty(){
		System.out.println("parameterized constructor");
		brand="honda";
		model="active6G";
		colour="black";
		price=75000.00;
		mileage=60;
	}
	Scooty(String brand,String model){
		System.out.println("2-arg parameterized constuctor");
		this.brand=brand;
		this.model=model;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scooty s=new Scooty();
		s.scootyInfo();
		
		Scooty s2=new Scooty("TVS","Jupiter");
		s2.scootyInfo();
		//Scooty s3=new Scooty();
		//s3.scootyInfo();
		
		
		System.out.println("main method ended");

	}
void scootyInfo() {
	System.out.println("Scooty brand:"+brand);
	System.out.println("Scooty model:"+model);
	System.out.println("Scooty colour:"+colour);
	System.out.println("Scooty price:"+price);
	System.out.println("Scooty mileage:"+mileage);
}
}
