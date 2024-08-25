package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message); //pass to super class
	}
}
public class UserDefinedExceptionFunds11 {
	public static void withdraw(double amount) throws InsufficientFundsException{
		double balance=500.00;
		if(amount>balance) {//checks balance condition
			throw new InsufficientFundsException("Insufficient funds fot withdrwal");
		}
		else {
			System.out.println("withdraw successful");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(600.00);
		}
		catch(InsufficientFundsException e) {
			System.out.println("caught the exception: "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");//executes

	}

}
