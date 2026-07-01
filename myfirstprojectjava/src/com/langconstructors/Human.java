package com.langconstructors;

public class Human {
	String name;
	String city;

	Human() {
		System.out.println("human class constructor called");
	}

	public Human(String name, String city) {
		System.out.println("parameterized constructor called from human");
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) {
		System.out.println("main method started from human");

	}
}

class Person extends Human {
	// public Person() {
	// super();
	// System.out.println("person class constructor called");
	// }
	Person(String name, String city) {
		super(name, city);
		System.out.println("parameterized constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started from person");

		Person p = new Person("bindu", "hyd");

		System.out.println(p.name);
		System.out.println(p.city);

	}

}
