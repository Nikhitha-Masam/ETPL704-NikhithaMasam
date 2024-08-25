package com.evergent.corejava.exceptionhandling;
 
//13.Finally is block, if exception is occur or not finally block will be executed.
public class ExceptionDemo5 {
	String  name="null";
	int k=2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle: "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e);
		}
		finally {
			System.out.println("This is final block");
		}
	}
			
	public static void main(String[] args) {
		ExceptionDemo5 ed2=new ExceptionDemo5();
		ed2.myData();

	}

}
