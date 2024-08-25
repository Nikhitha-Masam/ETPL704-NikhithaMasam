package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo8throws2 {
	String name=null;
	int k=0;
	public void myData() throws NullPointerException {//NullPointer Exception
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("end"); //unreachable code
	}
	public void myChange() throws NullPointerException{ 
		myData();
		System.out.println("My change method");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8throws2 ex1=new ExceptionDemo8throws2();
			ex1.myChange();
		}
		catch(Exception e) {
			System.out.println("I can handle "+e);
		}

	}

}
