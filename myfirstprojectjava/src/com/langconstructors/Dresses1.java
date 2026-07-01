package com.langconstructors;

public class Dresses1 {
	String name;
	String colors;
	double price;
	String brands;
	
	Dresses1(){
		System.out.println("no arg constructor called ");
	}
	Dresses1(String name){
		System.out.println("parameterized constructor");
		this.name=name;
		
	}
	Dresses1(Dresses1 d,String colors){
		this.name=d.name;
		this.colors=colors;
	}
	Dresses1(Dresses1 d,double price){
		this.name=d.name;
		this.colors=d.colors;
		this.price=price;
	}
		public static void main(String[] args) {
		System.out.println("main method started");
		Dresses1 d=new Dresses1();
		d.dressedInfo();
		Dresses1 d1=new Dresses1("bindu");
		d1.dressedInfo();
		Dresses1 d2=new Dresses1(d1,"yellow");
		d2.dressedInfo();
		Dresses1 d3=new Dresses1(d2,450.0);
		d3.dressedInfo();
		Dresses1 d4=new Dresses1(d3,"anarkali");
		d4.dressedInfo();

	}
	void dressedInfo() {
		System.out.println("name:"+name);
		System.out.println("colors:"+colors);
		System.out.println("price:"+price);
		System.out.println("brands:"+brands);
		System.out.println("********************");
	}

}
