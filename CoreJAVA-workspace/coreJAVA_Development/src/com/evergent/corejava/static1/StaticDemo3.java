package com.evergent.corejava.static1;

public class StaticDemo3 {
	static String cname="India";
	String name="pavan";
	static public void myData() {
		//myShow() //it will give error, static methods cant access non-static methods
		System.out.println("my data");
	}
	public void myShow() {
		System.out.println("my show method");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();

	}

}
