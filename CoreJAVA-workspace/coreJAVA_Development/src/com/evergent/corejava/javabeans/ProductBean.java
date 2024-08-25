package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class ProductBean  implements Serializable{
	private int pno;
	private String pname;
	private double price;
	
	//initializing variables through constructor
	public ProductBean(int pno, String pname, double price) {
		 
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	//getter methods
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	
	
	
}
