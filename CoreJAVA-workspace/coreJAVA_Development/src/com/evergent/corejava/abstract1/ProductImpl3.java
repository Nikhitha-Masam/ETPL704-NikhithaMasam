package com.evergent.corejava.abstract1;

 public class ProductImpl3 extends Product3 {
	 public ProductImpl3() { //sub class constructor
		 System.out.println("sub class constructor");
	 }
	public void newProduct() {
		System.out.println("new products");
	}
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		Product3 p1=new ProductImpl3();//We can't create object
		//to an abstract class,but we can create reference
		//to abstract class
		
		p1.allProducts();
		p1.newProduct();
		 

	}

}
