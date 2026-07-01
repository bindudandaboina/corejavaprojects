package com.langfunOperators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int result = 5;

		System.out.println(result);
		// explicit type casting
		// result =(int)(result + 4.5);//Type mismatch: cannot convert from double to
		
		result += 4.5;// result=result+4.5;
		System.out.println(result);// 9

		// result=result-2.5;
		result -= 2.5;// result=result-2.5;
		System.out.println(result);
		// result=result*3.5;
		result *= 3.5;
		System.out.println(result);// 21
		// result=result/4.5;
		result /= 4.5;
		System.out.println(result);// 4
		// result=result%1.5;
		result %= 1.5;
		System.out.println(result);// 1

	}

}
