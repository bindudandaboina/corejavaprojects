package com.langfund;

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		String  name = "bhukya"; //string literal
		String s=new String("Dandaboina");//object+literals
		
		char c='A';//string in single quotes
		char c1=10;//ASCII
		char c2='\u0000';//unicode
		
		Boolean WhenHostelFoodIsTastey=false;
		if (WhenHostelFoodIsTastey)
		{
			System.out.println("its a good");
		} else {
				System.out.println("itsbad");
			}
		System.out.println(name);
		System.out.println(s);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		float f1=123;
		float f2=0215;
		float f3=0x123;
		float f4=0xbad;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		}

	}


