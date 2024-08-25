package com.evergent.corejava.oops;

public class MethodsFlow {
	public void display() {
		System.out.println("No arguments with no return type");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public  int myData(int a,int b) {
		return a*b;
	}
	public int myChange() {
		return 10;
	}
	public static void main(String[] args) {
		MethodsFlow mf=new MethodsFlow();
		mf.display();
		mf.add(5, 5);
		System.out.println(mf.myData(5, 5));
		System.out.println(mf.myChange());

	}

}
