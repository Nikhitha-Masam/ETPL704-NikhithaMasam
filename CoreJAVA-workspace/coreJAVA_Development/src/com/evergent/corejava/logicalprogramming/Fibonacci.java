package com.evergent.corejava.logicalprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<5;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}

	}

}
