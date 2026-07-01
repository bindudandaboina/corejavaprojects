package com.javaintro.garbage;

public class Student {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + "object us garbage collected ");
	}

	String name;

	Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
//		nullyfying the objects
		Student s1 = new Student("A");
		s1 = null;
//		reassinging the objects
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		s2 = s3;
//		anonymous objects
		new Student("D");
		createStudent();

		System.gc();
		System.out.println("program executed");

	}

	public static void createStudent() {
		Student s4 = new Student("E");
	}
}
