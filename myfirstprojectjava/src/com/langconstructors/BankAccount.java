package com.langconstructors;

public class BankAccount {
	int accno;
	String name;
	double balance;
	double adharNo;
	double pancard;

	BankAccount() {
		accno = 567747355;
		name = "dandaboina";
		balance = 560000.00;
		adharNo = 9787543256.00;
		pancard = 63786238.00;
	}

	BankAccount(int accno, String name, double balance, double adharNo, double pancard) {
		System.out.println("4 arg parameterized constuctor");
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.adharNo = adharNo;
		this.pancard = pancard;
	}

	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	BankAccount(String name, int accno) {
		this.name = name;
		this.accno = accno;
	}

	BankAccount(int accno, double adharNo) {
		this.accno = accno;
		this.adharNo = adharNo;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount ba = new BankAccount();
		ba.bankInfo();
		BankAccount ba1 = new BankAccount(374726, "bindu", 7869.00, 88474893.00, 53783889.00);
		ba1.bankInfo();
		BankAccount ba2 = new BankAccount("bindu", 986678.00);
		ba2.bankInfo();
		BankAccount ba3 = new BankAccount("bhumi", 547427);
		ba3.bankInfo();
		BankAccount ba4 = new BankAccount(6322828, 62632732.00);
		ba4.bankInfo();
		System.out.println("main method ended");
	}

	void bankInfo() {
		System.out.println("bank account:" + accno);
		System.out.println("bank name:" + name);
		System.out.println("bank balance:" + balance);
		System.out.println("adharno:" + adharNo);
		System.out.println("password:" + pancard);
	}

}
