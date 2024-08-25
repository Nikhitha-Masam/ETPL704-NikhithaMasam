package com.evergent.corejava.exceptionhandling;

class InvalidScoreException extends RuntimeException{ //unchecked exceptions extends RuntimeException
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedUncheckedExceptionDemo12 {
	public static void validateScore(int score) throws InvalidScoreException{
		double balance=500.00;
		if(score<0 || score>100) {
			throw new InvalidScoreException("Score must be between 0 and 100");
		}
		else {
			System.out.println("score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateScore(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("caught the exception: "+e.getMessage());//prints exception messgae
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");//executes

	}

}
