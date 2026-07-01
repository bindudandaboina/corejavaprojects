package com.langconstructors;

public class Course {
	int id;
	String name;

	public Course() {
		System.out.println(" course class constuctor called");
	}

	public Course(int id, String name) {
		System.out.println("parameterized constructor called from course");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

	}

	public class Student1 extends Course {
		public Student1(int id, String name) {
			super(id, name);
			System.out.println("parameterized constructor called");
		}

		public static void main(String[] args) {
			System.out.println("main method started from student");

			Course c = new Course();
			Student1 s = c.new Student1(101, "bindu");

			System.out.println(s.id);
			System.out.println(s.name);

		}
	}

}
