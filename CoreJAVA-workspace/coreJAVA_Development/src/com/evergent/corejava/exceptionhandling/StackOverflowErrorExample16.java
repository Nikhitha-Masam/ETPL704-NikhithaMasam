package com.evergent.corejava.exceptionhandling;

public class StackOverflowErrorExample16 {
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
		System.out.println("Caught stack overflow error:"+e.getMessage());
		}
	}
	//will be in loop at this lines
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
