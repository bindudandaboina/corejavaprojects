package com.langconstructors;

public class House {
	String location;
	int rooms;
	double price;

	House() {
		location = "hyd";
		rooms = 5;
		price = 9000.00;

	}

	House(String location, int rooms, double price) {
		this.location = location;
		this.rooms = rooms;
		this.price = price;
	}

	House(String location, int rooms) {
		this.location = location;
		this.rooms = rooms;
	}

	House(int rooms, double price) {
		this.rooms = rooms;
		this.price = price;
	}

	House(String location, double price) {
		this.location = location;
		this.price = price;
	}

	House(String location) {
		this.location = location;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		House h = new House();
		h.houseInfo();
		House h1 = new House("vizag", 4, 45000.00);
		h1.houseInfo();
		House h2 = new House("banglore", 3);
		h2.houseInfo();
		House h3 = new House(5, 89898.00);
		h3.houseInfo();
		House h4 = new House("bhupalpally", 60000.00);
		h4.houseInfo();
		House h5 = new House("warangal");
		h5.houseInfo();

		System.out.println("main method ended");

	}

	void houseInfo() {
		System.out.println("house location:" + location);
		System.out.println("house rooms:" + rooms);
		System.out.println("house price:" + price);

	}

}
