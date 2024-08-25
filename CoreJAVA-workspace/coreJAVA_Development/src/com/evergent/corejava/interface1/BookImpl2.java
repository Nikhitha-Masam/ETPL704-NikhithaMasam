package com.evergent.corejava.interface1;

public class BookImpl2 implements Book {
	public void bookTitle() {
		System.out.println("core java");
	}
	public void bookAuthor() {
		System.out.println("Oracle crop"+cname);
	}
	public void bookPrice() {
		System.out.println("Rs. 1000");
	}
	public void show() { //local method of this class
		System.out.println("local method ");
	}
	public static void main(String[] args) {
		Book b=new BookImpl2();  //we can't create object to interface,
								//but can create reference to Interface
		b.bookAuthor();
		b.bookPrice();
		b.bookTitle();
	 

	}

}
