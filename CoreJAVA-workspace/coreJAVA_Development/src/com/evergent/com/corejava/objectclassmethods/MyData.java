package com.evergent.com.corejava.objectclassmethods;

public class MyData {

	public static void main(String[] args) {
		ImmutableString str=new ImmutableString("Hellooo");
		System.out.println(str.myValue());
		System.out.println(str.toString());//get same output as before

	}

}
