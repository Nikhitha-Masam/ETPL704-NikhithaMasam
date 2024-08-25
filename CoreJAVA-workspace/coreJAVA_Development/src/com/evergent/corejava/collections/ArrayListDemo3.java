package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		//arraylist store different data types
		myList.add(100);
		myList.add("Hello");
		myList.add(45.5);
		//allow duplicates
		myList.add(100);
		
		System.out.println(myList);
		
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
