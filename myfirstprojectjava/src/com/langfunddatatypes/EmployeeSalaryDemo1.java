package com.langfunddatatypes;
//no arguments with return type

public class EmployeeSalaryDemo1 {

	 void main( ) {
		System.out.println("main method started");
		double total_sal= getEmpSal();
		double bonus=getBonus();
		System.out.println("total salary is:"+(total_sal+bonus));
		double withdraw=getWithdraw();
		System.out.println("withdraw is:"+withdraw);
		
		System.out.println("main method ended");

	}
	double getEmpSal() {
		double total_sal=0;
		double sal=100000.00;
		double hra=35000.00;
		return total_sal=sal+hra;
	}
	double getBonus() {
		double bonus=12000.00;
		return bonus;
	}
	double getWithdraw() {
		double withdraw=5000.00;
		return withdraw;
	}

}
