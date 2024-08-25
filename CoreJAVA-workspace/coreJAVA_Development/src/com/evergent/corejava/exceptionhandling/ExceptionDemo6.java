package com.evergent.corejava.exceptionhandling;
 
//16.Try followed by either catch block or finally block.
public class ExceptionDemo6 {
	String  name="null";
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("end");
		}
		finally {
			System.out.println("Finally block");
		}
	}
			
	public static void main(String[] args) {
		ExceptionDemo6 ed2=new ExceptionDemo6();
		ed2.myData();

	}

}
