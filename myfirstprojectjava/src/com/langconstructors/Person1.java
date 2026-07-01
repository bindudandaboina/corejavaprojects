package com.langconstructors;
//constructor chaining

public class Person1 {
	int id;
	String name;

	Person1() {
		System.out.println("constructor called from person");
	}

	Person1(int id, String name) {
		System.out.println("parameterized constructor called");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		System.out.println("main method started from person1");

	}
}

	class Bag extends Person1 {
		Bag() {
			System.out.println("default constructor called");
		}

		Bag(int id, String name) {
			super(id, name);
			System.out.println("bag parameterized constructor called");
		}

		public static void main(String[] args) {
			System.out.println("main method started from bag");
			Bag b = new Bag(1, "xyz");
			b.bagInfo();

		}

		void bagInfo() {
			System.out.println("id:" + id);
			System.out.println("name:" + name);

		}

	}

