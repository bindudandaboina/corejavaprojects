package com.langconstructors;

public class School {
	int rooms;
	int sid;
	String name;
	String location;
	double fee;

	School() {
		this(5, 1);
		System.out.println("no arg constructor:");
	}

	public School(int rooms, int sid) {
		this(rooms, sid, "bindu");
		this.rooms = rooms;
		this.sid = sid;
	}

	public School(int rooms, int sid, String name) {
		this(rooms, sid, name, "hyd");
		this.rooms = rooms;
		this.sid = sid;
		this.name = name;
	}

	public School(int rooms, int sid, String name, String location) {
		this(rooms, sid, name, location, 123494.00);
		this.rooms = rooms;
		this.sid = sid;
		this.name = name;
		this.location = location;
	}

	public School(int rooms, int sid, String name, String location, double fee) {

		this.rooms = rooms;
		this.sid = sid;
		this.name = name;
		this.location = location;
		this.fee = fee;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		School s = new School();
		s.schoolInfo();
		School s1 = new School(3, 10);
		s1.schoolInfo();
		School s2 = new School(2, 19, "bhumi");
		s2.schoolInfo();
		School s3 = new School(5, 21, "bhumi");
		s3.schoolInfo();

	}

	void schoolInfo() {
		System.out.println("rooms:" + rooms);
		System.out.println("sid:" + sid);
		System.out.println("name:" + name);
		System.out.println("location:" + location);
		System.out.println("fee:" + fee);
		System.out.println("__________________________");
	}

}
