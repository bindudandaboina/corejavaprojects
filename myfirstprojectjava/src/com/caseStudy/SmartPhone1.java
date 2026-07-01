package com.caseStudy;

public class SmartPhone1 {
	int productId;
	String productName;
	String brand;
	double price;
	double warranty;

	SmartPhone1() {
				System.out.println("constructor called from samrtPhone1");
	}

	// parameterized constructor
	public SmartPhone1(int productId, String productName, String brand, double price, double warranty) {

		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}

	// copy constructor
	SmartPhone1(SmartPhone1 s) {
		this.productId = s.productId;
		this.productName = s.productName;
		this.brand = s.brand;
		this.price = s.price;
		this.warranty = s.warranty;
	}
	void display() {
		System.out.println("product id:"+productId);
		System.out.println("product Name:"+productName);
		System.out.println("product brand:"+brand);
		System.out.println("product price:"+price);
		System.out.println("product warranty:"+warranty);
	}


	public static void main(String[] args) {
		System.out.println("main method started from smartphone1");

	}

	class OnlineShopping extends SmartPhone1 {
		OnlineShopping() {
			System.out.println("constructor called from onlineshopping");
		}

		public static void main(String[] args) {
			SmartPhone1 s = new SmartPhone1(101,"laptop","lenovo",80000.00,2);
			// copied all products but product id was changed
			SmartPhone1 s1 = new SmartPhone1(s);
			s1.productId = 102;
			// display both products
			System.out.println("original product:");
			s.display();
			System.out.println("copied product:");
			s1.display();
			System.out.println("main method started from onlineshopping");

		}

			}

}

