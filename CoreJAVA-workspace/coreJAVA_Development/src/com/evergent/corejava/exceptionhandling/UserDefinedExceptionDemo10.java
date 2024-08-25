package com.evergent.corejava.exceptionhandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);//pass to super class
	}
}
public class UserDefinedExceptionDemo10 {
	public static void checkAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
		else {
			System.out.println("Access granted-you are old enough");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(16); //age<18, so exception occurs
		}
		catch(InvalidAgeException e) {
			System.out.println("caught the exception: "+e.getMessage());
			System.out.println(e); //prints about exception
		}
		System.out.println("Program continues after handling the exception");

	}

}
