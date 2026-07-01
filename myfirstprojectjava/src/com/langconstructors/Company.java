package com.langconstructors;

class Company {
	String cmpName;
	String location;
	int employees;
	double revenue;
	
	Company(){
		this("dandaboina","hyd");
		System.out.println("no arg constructor");
	}
	

	 Company(String cmpName, String location) {
		this(cmpName,location,5);
			}
	 


	public Company(String cmpName, String location, int employees) {
		this(location,7,700000);
		
	}
	


	public Company(String location, int employees, double revenue) {
		
		this.location = location;
		this.employees = employees;
		this.revenue = revenue;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Company c=new Company();
		c.companyInfo();
		Company c1=new Company("bhukya","kphb");
		c1.companyInfo();
	Company c2=new Company("warangal","nijiji");
	c2.companyInfo();
		
		System.out.println("main method ended");
	}
	void companyInfo(){
		System.out.println("cmpName:"+cmpName);
		System.out.println("location:"+location);
		System.out.println("employees:"+employees);
		System.out.println("revenue:"+revenue);
		System.out.println("--------------------------");
	}
	

}
