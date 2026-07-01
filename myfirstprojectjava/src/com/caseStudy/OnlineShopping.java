package com.caseStudy;

public class OnlineShopping {
	int productId;
	String productName;
	String Brand;
	double price;
	float warranty;
	OnlineShopping(){
		System.out.println("constructor called");
	}
	OnlineShopping(int productId,String productName,String Brand,double price,float warranty){
		
		this.productId=productId;
		this.productName=productName;
		this.Brand=Brand;
		this.price=price;
		this.warranty=warranty;
	}
	//copy constructor
	OnlineShopping(OnlineShopping obj){
		this.productId=obj.productId;
		this.productName=obj.productName;
		this.
	}
	

	   	  public static void main(String[] args) {
		System.out.println("main method started from onlineshopping");
		

	}
}

	  class SmartPhone extends OnlineShopping{
		SmartPhone(){
			
			System.out.println("constructor called from smartphone");
		}
		SmartPhone(int productId,String productName,String Brand,double price,float warranty){
			super(productId,productName,Brand,price,warranty);
		System.out.println("parameterized constructor called from smartphone");
		}
		public static void main(String[] args) {
			SmartPhone s=new SmartPhone(101,"laptop","lenovo",45000.00,2.5f);
			s.smartphoneInfo();
			SmartPhone s1=new SmartPhone();
			s1.smartphoneInfo();
			
			System.out.println("main method started from smartphone");
		}
		void smartphoneInfo() {
			System.out.println("product id:"+productId);
			System.out.println("product name:"+productName);
			System.out.println("product brand:"+Brand);
			System.out.println("product price:"+price);
			System.out.println("product warranty:"+warranty);
		}
	}


