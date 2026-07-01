package com.langfunddatatypes;

public class ATMTransactions {
	static {
		System.out.println("static block1");
	}
	{
		System.out.println("static block 2");
	}
	double balance=10000.00;
	

	 void main() {
		 System.out.println("welcome to online banking");
		 checkBalance();
		 Deposit(50000.00);
			withdraw(30000.00);
			
		}
	 void checkBalance() {
		 System.out.println("the current balance is:"+balance);
	 }
	 void Deposit(double amount) {
		 System.out.println("the current balance is:"+balance);
		 balance=balance+amount;
		 System.out.println("amount deposited:"+amount);
	 }
	 void withdraw(double amount) {
		 if(amount>balance) {
			 System.out.println("insufficient balance");
		 }else {
			 balance=balance-amount;
			 System.out.println("amount withdraw:"+amount);
		 }
	 }

}
