package com.langconstructors;

public class Animal {
	String name;
	String colour;

	public Animal() {
		System.out.println("animal class constuctor called");
	}

	public Animal(String name, String colour) {
		System.out.println("parameterized constructor called from animal");
		this.name = name;
		this.colour = colour;
	}

	public static void main(String[] args) {
		System.out.println("main method started from animal");

	}

	public class Dog extends Animal {
		public Dog(String name, String colour) {
			super(name,colour);
			System.out.println("parameterized constructor called");
		}

		public static void main(String[] args) {
			System.out.println("main method started from dog");
			Animal a = new Animal();
			Dog d = a.new Dog("puppy", "white");
			System.out.println(d.name);
			System.out.println(d.colour);
		}
	}

}
