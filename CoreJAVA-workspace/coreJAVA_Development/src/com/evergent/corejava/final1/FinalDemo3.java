package com.evergent.corejava.final1;
class MyClass1{
	final public void myProducts() {
		System.out.println("All products");
	}
}
public class FinalDemo3 extends MyClass1{//final class cant be inherited
	final String cname="India";
	public void myProducts1() { 
		 
		System.out.println("new products");
	}
	public void myData() {
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo3 f2=new FinalDemo3();
		f2.myData();
		f2.myProducts1();

	}

}
