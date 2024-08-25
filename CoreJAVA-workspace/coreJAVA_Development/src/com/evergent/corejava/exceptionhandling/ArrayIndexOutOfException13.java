package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfException13 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println("Accessing element at index: "+numbers[10]); //array size is 5 only
			//so it raise ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught an error :"+e);
			System.out.println("Error:"+e.getMessage());
		}
		System.out.println("program continues after handling exception");//executes
	}
}
