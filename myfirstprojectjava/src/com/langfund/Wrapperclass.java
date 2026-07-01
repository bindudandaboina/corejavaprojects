package com.langfund;

public class Wrapperclass {

	public static void main(String[] args) {
		int num=100;
		Integer obj=num;
		System.out.println("primitive int:"+num);
		System.out.println("Integer obj:"+obj);
		Integer obj2=num;
		int num2=200;
		System.out.println("Integer obj:"+obj);
		System.out.println("primitive int:"+num);
		}

}
