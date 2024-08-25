package com.evergent.corejava.final1; class MyClass{
	final public void myProducts() {
		System.out.println("All products");
	}
}
public class FinalDemo2 extends MyClass{
	final String cname="India";
	public void myProducts1() { //myProducts() will give error bcz final methods 
		//cant be inherited
		System.out.println("new products");
	}
	public void myData() {
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo2 f2=new FinalDemo2();
		f2.myData();
		f2.myProducts1();

	}

}
