package com.evergent.corejava.exceptionhandling;
class AgeNotFoundException extends Exception{
	public AgeNotFoundException(String message) {
		System.out.println("Hello: "+message);
	}
}
public class VoteAge {
	int age=14;
	public void myData() throws AgeNotFoundException{
		if(age<18) {
			throw new AgeNotFoundException("You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			VoteAge p=new VoteAge();
			p.myData();
		}
		catch(AgeNotFoundException e) {
			System.out.println(e);
		}

	}

}
