package com.evergent.corejava.oops;

public class Person {
	String name="Pavan";
	int age=22;
	String address="Hanmakonda";
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	public static void main(String[] args) {
		 Person p=new Person();
		 p.display();

	}

}
