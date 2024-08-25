package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeBean emp=new EmployeeBean();
		//initializing variables through beans
		emp.setEname("ravi");
		emp.setEno(100);
		emp.setSal(500000);
		
		//getting variables from bean
		System.out.println("Employee No.:"+emp.getEno());
		System.out.println("Employee name:"+emp.getEname());
		System.out.println("employee sal:"+emp.getSal());
		

	}

}
