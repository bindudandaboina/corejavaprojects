package com.langconstructors;

public class Account {
	int actNbr;
	String actHolderName;

	Account() {
		System.out.println("constructor called");
	}

	Account(int actNbr, String actHolderName) {
		System.out.println("parameterized constructor called from Account");
		this.actNbr = actNbr;
		this.actHolderName = actHolderName;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
	}

	public class SavingsAccount extends Account {
		double balance;

		SavingsAccount(int actNbr, String actHolderName, double balance) {
			super(actNbr, actHolderName);
			this.balance = balance;
			System.out.println("parameterized constructor called");

		}

		public static void main(String[] args) {
			System.out.println("main methid started from saving account");
			Account a = new Account();
			SavingsAccount sa = a.new SavingsAccount(2637, "binduyadav", 898989.00);
			sa.display();

		}

		void display() {
			System.out.println("actNbr:" + actNbr);
			System.out.println("actHolderName:"+actHolderName);
			System.out.println("balance:" + balance);
		}
	}

}
