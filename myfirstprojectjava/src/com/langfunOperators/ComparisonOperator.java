package com.langfunOperators;
//== != < <= > >=

//comparison operator will give you the resulted values like boolean expressions.
//either true or false.
//byte short int long float double char boolean
public class ComparisonOperator {

	public static void main(String[] args) {

		int x = 5;
		int y = 6;
		System.out.println(x != y);// true
		System.out.println(x < y);//true
		System.out.println(x > y);//false
		System.out.println(x <= y);//true
		System.out.println(x >= y);//false
		char c1 = 'A';
		char c2 = 'A';
		int a = 10;
		int b = 10;
		int c = 20;

		System.out.println(a == b);// true
		System.out.println(a == c);// false
		System.out.println(c1 == c2);// true
		// ==operator checks address of the object but not values.
		// where string is a predefined object in java.

		String s1 = "bindu";// string literals are stored in SCP
		String s2 = new String("bindu");// string object stored in heap
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equalsIgnoreCase(s2));//true
	}

}
