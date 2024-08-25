package com.evergent.corejava.final1;

public class FinalDemo1 {
	final String cname="India";
	public void myData() {
		//cname=nikhitha //it will give error(we cant modify final variables)
		System.out.println("My data");
	}
	public static void main(String[] args) {
		FinalDemo1 f1=new FinalDemo1();
		f1.myData();

	}

}
