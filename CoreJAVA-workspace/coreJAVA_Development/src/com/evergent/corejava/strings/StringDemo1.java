package com.evergent.corejava.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1=new String("JAVA");
		String str2=new String("JAVA");
		if(str1==str2) { //compares memory locations
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}

	}

}
