package com.langconstructors;

public class Mobile {
	String brand;
	int ram;
	double price;

	Mobile() {
		System.out.println("no arg constructor");
		brand = "samsung";
		ram = 6;
		price = 50000.00;
	}

	Mobile(String brand, int ram) {
		this.brand = brand;
		this.ram = ram;
	}

	Mobile(String brand) {
		this.brand = brand;
	}

	Mobile(String brand, int ram, double price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	Mobile(int ram) {
		this.ram = ram;
	}

	Mobile(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method strted");
		Mobile m = new Mobile();
		m.mobileInfo();
		Mobile m1 = new Mobile("moto", 5);
		m1.mobileInfo();
		Mobile m2 = new Mobile("moto");
		m2.mobileInfo();
		Mobile m3 = new Mobile("redmi note", 6, 20000.00);
		m3.mobileInfo();
		Mobile m4 = new Mobile("ram");
		m4.mobileInfo();
		Mobile m5 = new Mobile(20000.00);
		m5.mobileInfo();

		System.out.println("main method ended");

	}

	void mobileInfo() {
		System.out.println("mobile brand:" + brand);
		System.out.println("mobile ram:" + ram);
		System.out.println("mobile price:" + price);

	}

}
