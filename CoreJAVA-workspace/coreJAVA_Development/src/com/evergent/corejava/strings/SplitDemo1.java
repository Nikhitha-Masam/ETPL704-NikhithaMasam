package com.evergent.corejava.strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		String str="Java is a Programming Language";
		String[] words=str.split(" ");
		//here split() will split the string by spaces
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
