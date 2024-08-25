package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		Student9 s1=new Student9("Nikhitha",21);
		Student9 s2=new Student9(s1);
		s1.displayDetails();
		s2.displayDetails();
	}
}
