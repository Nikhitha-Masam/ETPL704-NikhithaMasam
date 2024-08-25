package com.evergent.corejava.generalprogramming;

enum Color{
	red,blue,green,black;
};
enum Subject{
	maths,dsa,daa,java;
}
enum Name{
	sandhya,rakshitha,santhosha,nikhitha;
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c=Color.red;
		System.out.println(c);
		Subject s=Subject.java;
		System.out.println(s);
		Name n=Name.nikhitha;
		System.out.println(n);

	}

}
