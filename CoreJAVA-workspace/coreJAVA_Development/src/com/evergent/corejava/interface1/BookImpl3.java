package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook { //java supports multiple
	//inheritance through interfaces
	public void bookTitle() {
		System.out.println("core java");
	}
	public void bookAuthor() {
		System.out.println("Oracle crop"+cname);
	}
	public void bookPrice() {
		System.out.println("Rs. 1000");
	}
	public void myNewBook() {
		System.out.println("my new book method");
	}
	 
	public void show() {
		System.out.println("local method ");
	}
	public static void main(String[] args) {
		BookImpl3 book=new BookImpl3();
		book.bookAuthor();
		book.bookPrice();
		book.bookTitle();
		book.show();
		book.myNewBook();

	}

}
