package com.evergent.corejava.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a Programming Language";
		String[] words=str.split(" ");
		 //for each loop
		for(String word:words) {
			System.out.println(word);
		}

	}

}