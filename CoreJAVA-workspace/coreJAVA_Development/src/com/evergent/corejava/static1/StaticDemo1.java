package com.evergent.corejava.static1;

public class StaticDemo1 {
	static String cname="India";
	static public void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.display();

	}

}
