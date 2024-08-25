package com.evergent.corejava.abstract1;

public class ProductImpl extends Product {
	public void newProduct() {
		System.out.println("new products");
	}
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		
		p1.allProducts(); //abstract class method
		p1.newProduct(); //abstract class method , overriden here
		p1.show(); //local method

	}

}
