package com.langconstructors;

public class Parent {
	String name;
	int age;

	Parent() {
		System.out.println("constructor called from parent");
	}

	Parent(String name, int age) {
		System.out.println("parameterized constructor called from parent");
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started from parent");

	}
}

class Child extends Parent {
	Child() {
		System.out.println("default constructor");
	}

	Child(String name, int age) {
		super(name, age);
		System.out.println("parameterized constructor called from child");
	}

	public static void main(String[] args) {
		System.out.println("main method started from child");
		Child c = new Child("bhumi", 21);
		c.childInfo();

	}

	void childInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}
