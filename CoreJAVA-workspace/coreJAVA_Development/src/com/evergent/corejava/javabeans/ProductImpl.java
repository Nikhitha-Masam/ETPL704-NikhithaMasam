package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBean p=new ProductBean(10,"laptop",85000);
		//accessing values through bean
		System.out.println("Product no:"+p.getPno());
		System.out.println("Product name:"+p.getPname());
		System.out.println("Product price:"+p.getPrice());
		

	}

}
