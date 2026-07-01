package com.javaintro.garbage;

public class Test1 {
	String name="Bindu";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
			}
	void m1() 
	{
		Test1 t =new Test1();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test1 t1 = new Test1();
		t1=null;
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
//		reassining the object
		Test1 t4 = new Test1();
		t4=t2;
		System.out.println(new Test1().name);;
		t4.m1();
		
		System.gc();
		
	}

}
