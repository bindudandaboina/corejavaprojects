package com.langfunddatatypes;

public class EmployeeId {
	
	int getemployeeId(){
		return 101;
	}

	public static void main(String[] args) {
		EmployeeId e1 =new EmployeeId();
		int id =e1.getemployeeId();
		System.out.println("employeeId:"+id);
		
	}

}
