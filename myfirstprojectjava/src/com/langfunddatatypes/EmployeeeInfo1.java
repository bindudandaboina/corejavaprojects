package com.langfunddatatypes;

public class EmployeeeInfo1 {
	
	String getEmpDepartment(){
		return "java developer";
	}
		float getEmpHeight() {
			return 4.5f;
		}
		long getEmpNumber() {
			
			return 98676737267l;
			
		}
		String getEmpEmail() {
			return "bhumind@gmail.com";
		}
		char getEmpGender() {
			return 'F';
		}
		long getEmpAccount() {
			return 9876632378347284l;
		}
		float getEmpRating() {
			return 5;
		}
		float getEmpProfit() {
			return 12;
			
		}
		double getEmpBalance() {
			return 5000.00;
		}
		double getprice() {
		    return 56003.00; 	
		}
		char getGrade() {
			return 'A';
		}
		boolean isWorking() {
			return false;
		}
		boolean isPermanent() {
			return true;
		}
		String getCompanyName() {
			return  "Ramadevi";
		}
		double getFee() {
			return 593839.00;
			
		}
		double getTemperature() {
			return 34.76;
		}
		long getpanCard() {
			return 95857777;
			
		}
		double getWeight() {
			return 45.5;
			
		}
		float getkgs() {
			return 3.5f;
		}
		

	public static void main(String[] args) {
		EmployeeeInfo1 e1=new EmployeeeInfo1();
		
		System.out.println("department:"+e1.getEmpDepartment());
		System.out.println("height:"+e1.getEmpHeight());
		System.out.println("number:"+e1.getEmpNumber());
		System.out.println("email:"+e1.getEmpEmail());
		System.out.println("gender:"+e1.getEmpGender());
		System.out.println("account:"+e1.getEmpAccount() );
		System.out.println("rating:"+e1.getEmpRating());
		System.out.println("profit:"+e1.getEmpProfit());
		System.out.println("balance:"+e1.getEmpBalance());
		System.out.println("price:"+e1.getprice());
		System.out.println("grade:"+e1.getGrade());
		System.out.println("working:"+e1.isWorking());
		System.out.println("permanent:"+e1.isPermanent());
		System.out.println("company:"+e1.getCompanyName());
		System.out.println("fee:"+e1.getFee());
		System.out.println("temp:"+e1.getTemperature());
		System.out.println("pan:"+e1.getpanCard());
		System.out.println("weight:"+e1.getWeight());
		System.out.println("kgs:"+e1.getkgs());
	}
	}
