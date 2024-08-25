package com.evergent.corejava.oops;

 class PersonData{
	public void myPersonData() {
		System.out.println("persondata method");
	}
}

class PersonInfo extends PersonData{
	public void myDetails() {
		System.out.println("person info method");
	}
}
public class MultilevelInheritenceDemo extends PersonInfo {
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		MultilevelInheritenceDemo mi=new MultilevelInheritenceDemo();
		mi.myPersonData();
		mi.myDetails();
		mi.show();

	}

}
