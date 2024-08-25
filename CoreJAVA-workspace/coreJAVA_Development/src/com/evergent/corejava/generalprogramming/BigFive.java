package com.evergent.corejava.generalprogramming;

public class BigFive {
public static void main(String arg[]) {
	int a=10,b=20,c=30,d=40,e=50;
	if(a>b && a>c && a>d && a>e) {
		System.out.println("a is greater");
	}
	else if(b>c && b>d && b>e) {
		System.out.println("b is greater");
	}
	else if(c>d && c>e) {
		System.out.println("c is greater");
	}
	else if(d>e) {
		System.out.println("d is greater");
	}
	else {
		System.out.println("e is greater");
	}
}
}
