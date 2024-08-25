package com.evergent.corejava.static1;

public class Person6 {
	static String name="Pavan";
	int age=22;
	String address="hanmakonda";
	public void display() {
		name="Welcome";
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	public static void main(String[] args) {
		Person6 p1=new Person6();
		System.out.println(name);
		p1.display();
		Person6 p2=new Person6();
		System.out.println(name);

	}

}

