package com.langfunOperators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		System.out.println(x++);// 10 11
		System.out.println(y++);// 11 12
		System.out.println(++x);// 12
		System.out.println(++y);// 13
		System.out.println(--x);// 11
		System.out.println(--y);// 12
		System.out.println(x--);// 11 10
		System.out.println(y--);// 12 11
		System.out.println(x++);// 10 11
		System.out.println(y++);// 11 12
		System.out.println(--x);// 10
		System.out.println(x);// 10
		System.out.println(y);// 12
		System.out.println(x++ + y++ + --y + --x);// 44
		System.out.println(x++ + y++ + y-- + x-- - y++ - x++ + y++);// 37
		System.out.println(x++ - y++ - y-- - x--);// -30
		System.out.println(x++ + y++ + ++x + ++y);// 54
		System.out.println(y++ - x++ - --y - --x);// -26
		System.out.println(--x + --y + x++ + y++);// 54
		System.out.println(++x + ++y - ++x - ++y);// -2
		System.out.println(--x - --y - x-- - y--);// -34
		System.out.println(--x - --y);// -3
		System.out.println(++x + ++y);// 29
		System.out.println(++x + x++);// 28
		System.out.println(--x + --y);// 29
		System.out.println(x-- + y--);// 29
		System.out.println(--y + --x);// 25
		System.out.println(++y + x++ + x++ + y++);// 53
		System.out.println(--x - --y + ++x + ++y);// 28
		System.out.println(x++ + y++ - x++ + y++);// 30
		System.out.println(x++ - y++ - x-- - y--);// -36
		System.out.println(--x + --y + ++x + ++y);//64

	}

}