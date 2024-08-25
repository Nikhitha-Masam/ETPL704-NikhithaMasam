package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing {
	public static void main(String[] args) {
		//Autoboxing of characters
		char ch1='a';
		Character myc=new Character(ch1);
		//Auto-unboxing of character
		char ch=myc.charValue();
		System.out.println("value of ch:"+ch);
		System.out.println("value: "+myc);
		}
}
