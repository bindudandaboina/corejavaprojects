package com.langconstructors;

public class Languages {
	int noLangs;
	String names;
	String countries;

	Languages() {
		this(5,"maths");
		System.out.println("no arg constructor");
	}

	public Languages(int noLangs, String names) {
		this(noLangs,"english","countries");
		System.out.println("parameterized constructor called");
			}

	public Languages(int noLangs, String names, String countries) {

		this.noLangs = noLangs;
		this.names = names;
		this.countries = countries;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Languages l = new Languages();
		l.langInfo();
		Languages l1 = new Languages(1, "maths", "indian");
		l1.langInfo();
	}

	void langInfo() {
		System.out.println("nolangs:" + noLangs);
		System.out.println("names:" + names);
		System.out.println("countries:" + countries);
		System.out.println("***********************");
	}

}
