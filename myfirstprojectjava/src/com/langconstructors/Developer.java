package com.langconstructors;

public class Developer {
	int id;
	String name;
	String city;

	Developer() {
		System.out.println("constructor called from developer");
	}

	Developer(int id, String name, String city) {
		System.out.println("parameterized constructor called from developer");
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) {
		System.out.println("main method started from developer");

	}

	class Orgnaization extends Developer {
		Orgnaization(int id, String name, String city) {
			super(id, name, city);
			System.out.println("parameterized constructor called");
		}

		public static void main(String[] args) {
			System.out.println("main method started from org");
			Developer d = new Developer();
			Orgnaization o = d.new Orgnaization(1, "bindu", "hyd");
			System.out.println(o.id);
			System.out.println(o.name);
			System.out.println(o.city);
		}
	}

}
