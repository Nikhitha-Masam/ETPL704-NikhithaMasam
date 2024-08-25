package com.evergent.corejava.abstract1;

abstract public class Product3 {
public Product3(){ //abstract class constructor
	System.out.println("Abstract class constructor");
}
abstract public void newProduct(); //abstract method
public void allProducts() { //concrete method
	System.out.println("All products");
}
}
