package com.evergent.corejava.strings;

public class ReverseString {

	public static void main(String[] args) {
		 String str="Hello world!!!";
		 StringBuilder sb=new StringBuilder(str).reverse();
		 //reverse() method used to reverse the given string
		 System.out.println("After reverse: "+sb);

	}

}
