package com.langfund;
//JVM provides only for static and instance variables.

public class Datatype {
	//byte range :-128 to 127
	//by default, all integer literals int.
	byte b=(byte)257;//explicit type casting
	//short range :-32768 to 32767
	short s=b;
	
	//implicit type casting(byte-->short)
	short s1=(short)65535;//explicit type casting
	//int range :-2147483648 to 2147483647
	int i=s1; //implicit type casting (short-->int)
	int i1=(int)2147483648L;//explicit type casting
	//long range:-9223372036854775808 to 9223372036854775807
	long l=i;//implicit type casting(int->long)
	long l1 =9223372036854775807L;
	long l2 = 9223372036854775807L;
	//float range:approximately+_3.4E38
	//precision: 5 to 6 decimal digits+
		
	float f=l1;//implicit type casting(long->float)
	float f1=5.65676478765465F;
	//double range:approximately+_1.7E308
	//precision:10 to 15 decimal digits
	double d =5.65676478765465F;
	double d1=f1;//implicit type casting(float->double)
	//char&boolean
	char c;
	boolean boo;
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Datatype t1=new Datatype();
		System.out.println("byte value :"+t1.b);
		System.out.println("short value :"+t1.s);
		System.out.println("short value :"+t1.s1);
		System.out.println("int value :"+t1.i);
		System.out.println("int value :"+t1.i1);
		System.out.println("long value :"+t1.l);
		System.out.println("long value :"+t1.l1);
		System.out.println("float value :"+t1.f);
		System.out.println("float value :"+t1.f1);
		System.out.println("double value :"+t1.d);
		System.out.println("double value :"+t1.d1);
		System.out.println("char value :"+t1.c);
		System.out.println("boolean value :"+t1.boo);
		
	}

}
