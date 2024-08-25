package com.evergent.corejava.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		if(s1==s2) { //== compares the memory 
			//locations of given strings
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(s1.equals(s2)) { //checks the content of
			//given strings
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
