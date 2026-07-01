package com.langconstructors;

public class FoodOrder {
	int orderId;
	String customerName;
	String restaurantName;
	String itemName;
	double quantity;
	double price;
	//no arg constructor
	FoodOrder(){
		System.out.println("no arg constuctor called");
		orderId=1;
		customerName="bindu";
		restaurantName="ramadevi";
		itemName="chicken";
		quantity=2.5;
		price=200.00;
	}
	FoodOrder( int orderId ,String customerName,String itemName){
		this.orderId=orderId;
		this.customerName=customerName;
		this.itemName=itemName;
	}
	FoodOrder(int orderId,String customerName,String restaurantName,String itemName, double quantity){
		this.orderId=orderId;
		this.customerName=customerName;
		this.itemName=itemName;
		this.restaurantName=restaurantName;
		this.quantity=quantity;
		
        }
	FoodOrder(int orderId,String customerName,String restaurantName,String itemName){
		this.orderId=orderId;
		this.customerName=customerName;
		this.itemName=itemName;
		this.restaurantName=restaurantName;
	
				

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		FoodOrder f=new FoodOrder();
		f.foodOrderInfo();
		FoodOrder f1=new FoodOrder(101,"bhumi","chickenBiryani");
		f1.foodOrderInfo();
		FoodOrder f2=new FoodOrder(102,"anjali","dandaboina","muttonBiryani",2);
		f2.foodOrderInfo();
		FoodOrder f3=new FoodOrder(103,"varsha","mehfil","fried rice",3);
		f3.foodOrderInfo();
		
		System.out.println("main method ended");

	}
	void foodOrderInfo() {
		System.out.println("orderID:"+orderId);
		System.out.println("customerName:"+customerName);
		System.out.println("restaurantName:"+restaurantName);
		System.out.println("itemName:"+itemName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}

}
