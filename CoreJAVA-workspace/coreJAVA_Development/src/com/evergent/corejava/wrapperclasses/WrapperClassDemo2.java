package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f1=5.5f;
		Float f2=new Float(f1);
		float f3=f2.floatValue();
		
		double d1=7998.9;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		
		System.out.println("Float value is:"+f1);
		System.out.println("Float object value is:"+f2);
		System.out.println("Converted flaot object value to primitive:"+f3);
		
		System.out.println("Double value is:"+d1);
		System.out.println("Double object value is:"+d2);
		System.out.println("Converted Double object value to primitive:"+d3);
		
		System.out.println("Byte value is:"+b1);
		System.out.println("Byte object value is:"+b2);
		System.out.println("Converted Byte object value to primitive:"+b3);

	}

}
