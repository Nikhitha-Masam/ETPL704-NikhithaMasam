package com.evergent.corejava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Initial String: "+sb);
		//append a string
		sb.append(" World!");
		System.out.println("After append "+sb);
		//insert a string at a given index
		sb.insert(6," Beautiful ");
		System.out.println("After insertion: "+sb);
		//replace a substring 
		sb.replace(0, 5, "Hi");
		System.out.println("After replace:"+sb);
		//delete a substring
		sb.delete(0, 3);
		System.out.println("after delete:"+sb);
		//reverse the string
		sb.reverse();
		System.out.println("after reverse: "+sb);
		//capacity
		System.out.println("Buffer capacity:"+sb.capacity());
		//length
		System.out.println("Length of StringBuffer: "+sb.length());

	}

}
