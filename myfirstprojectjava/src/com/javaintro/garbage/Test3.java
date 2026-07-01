package com.javaintro.garbage;

public class Test3 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	Test3 i;
	public static void main(String[] args) {
		System.out.println("main methd started");
		Test3 t1=new Test3();
		Test3 t2=new Test3();
		Test3 t3=new Test3();
		
		t1=t3;
		t2=t1;
		t3=t2;
		
		t1=null;
		t2=null;
		t3=null;
		System.gc();
		
		
	}

}
