package com.langconstructors;

public class College {
	String name;
	String location;
	int ranks;

	College() {
		this("binduuu", "hyd");
		System.out.println("no arg constructor");
	}

	public College(String name, String location) {
		this(name, location, 6);
	}

	public College(String name, String location, int ranks) {

		this.name = name;
		this.location = location;
		this.ranks = ranks;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		College c = new College();
		c.collegeInfo();
		College c1 = new College("dandaboina", "kphb");
		c1.collegeInfo();
		College c2 = new College("nijmanai", "bhpl", 5);
		c2.collegeInfo();
	}

	void collegeInfo() {
		System.out.println("name:" + name);
		System.out.println("location:" + location);
		System.out.println("ranks:" + ranks);
		System.out.println("-------------------");
	}

}
