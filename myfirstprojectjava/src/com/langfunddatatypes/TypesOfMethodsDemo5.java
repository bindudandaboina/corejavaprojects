package com.langfunddatatypes;
//WOP with area of triangle,square,circle,rectangle.
import java.util.Scanner;

public class TypesOfMethodsDemo5 {
	//triangle=0.5*base*height
	//square=side*side
	//circle=PI* radius*radius
	//rectangle=height*breadth

	public static void main(String[] args) {
		TypesOfMethodsDemo5 t=new TypesOfMethodsDemo5();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a base:");
		float b=sc.nextFloat();
		System.out.println("enter a height:");
		double h=sc.nextDouble();
		double arTriangle=t.areaOfTriangle(b,h);
		
		
		System.out.println("enter a height");
		float height=sc.nextFloat();
		System.out.println("enter a breadth");
		double breadth=sc.nextDouble();
	
		double areRec=t.areaOfRectangle(height,breadth);
		System.out.println("area of rectangle:"+areRec);
		System.out.println("enter a side:");
		double s=sc.nextDouble();
		double areaSquare=t.areaOfSquare(s);
		
		
		System.out.println("enter a radius:");
		double r=sc.nextDouble();
		double radius=t.areaOfCircle(r);
		
	}
	double areaOfTriangle(float base,double height) {
		double areTri=0.5*base*height;
		return areTri;
		
	}
	double areaOfRectangle(float height,double breadth) {
		double areRec=height*breadth;
		return areRec;
	}
	double areaOfSquare(double side) {
		double s=side*side;
		return side;
	}
	double areaOfCircle( double radius) {
		double r=Math.PI*radius;
		return r;
	}

}
