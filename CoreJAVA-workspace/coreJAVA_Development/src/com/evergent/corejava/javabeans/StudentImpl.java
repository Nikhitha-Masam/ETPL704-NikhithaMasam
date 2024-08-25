package com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		//setting value through bean
		stu.setSno(100);
		stu.setSname("ravi");
		stu.setAddress("Hanmakonda");
		
		
		System.out.println(stu);

	}

}
