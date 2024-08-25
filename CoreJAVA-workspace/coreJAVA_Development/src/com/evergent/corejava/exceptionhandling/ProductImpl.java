package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello: "+message);
	}
}
public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100) {
			throw new ProductNotFoundException("There is no products");
		}
		else {
			System.out.println("Products are there");
		}
	}
	public static void main(String[] args) {
		try {
			ProductImpl p=new ProductImpl();
			p.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println(e);
		}

	}

}
