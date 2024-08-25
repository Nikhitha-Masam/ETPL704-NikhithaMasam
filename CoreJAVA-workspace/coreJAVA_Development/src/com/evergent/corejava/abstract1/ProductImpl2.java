package com.evergent.corejava.abstract1;

 public class ProductImpl2 extends Product {
	public void newProduct() {
		System.out.println("new products");
	}
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		Product p1=new ProductImpl2();//We can't create object
		//to an abstract class,but we can create reference
		//to abstract class
		
		p1.allProducts();
		p1.newProduct();
		 

	}

}
