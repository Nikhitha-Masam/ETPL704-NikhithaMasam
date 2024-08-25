package com.evergent.corejava.interface1;

public class BookImpl implements Book { //class implements interface
	public void bookTitle() {
		System.out.println("core java");
	}
	public void bookAuthor() {
		System.out.println("Oracle crop"+cname);
	}
	public void bookPrice() { //should override every method of interface
		System.out.println("Rs. 1000");
	}
	public void show() { //local method of this class
		System.out.println("local method ");
	}
	public static void main(String[] args) {
		BookImpl book=new BookImpl();
		book.bookAuthor();
		book.bookPrice();
		book.bookTitle();
		book.show();

	}

}
