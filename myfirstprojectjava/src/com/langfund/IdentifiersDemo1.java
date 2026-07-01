package com.langfund;

public class IdentifiersDemo1 {
	int stdid=1;
	double price=1000.0;
	String name="bindu";
	//float ratings=4.5;
	
	void hello() {
		System.out.println("hellooo everyone");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		IdentifiersDemo1 i1=new IdentifiersDemo1();
		System.out.println(i1.stdid);
		System.out.println(i1.price);
		System.out.println(i1.name);
		//System.out.println(i1.ratings);
		i1.hello();
		System.out.println("main method ended");
		}

}
