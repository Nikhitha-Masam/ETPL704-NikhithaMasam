package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		int a=10;
		//Automatically primitive data types converts to object
		Integer i1=new Integer(a);
		System.out.println(i1);
		//object to data types
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
