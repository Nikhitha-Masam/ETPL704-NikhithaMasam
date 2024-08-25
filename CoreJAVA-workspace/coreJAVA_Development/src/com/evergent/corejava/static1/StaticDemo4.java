package com.evergent.corejava.static1;

public class StaticDemo4 {
	static String cname="India";
	String name="Ravi";
	static public void myData() {
		 
		System.out.println("my data");
	}
	public void myShow() {
		myData(); //non static  methods can access static methods
		System.out.println("my show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
		StaticDemo4 s4=new StaticDemo4();
		s4.myShow();

	}

}
