package com.evergent.corejava.generalprogramming;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||  i==n-1 || j==0 || j==n-1) {
					System.out.print("* ");
				}
				 
				else if(i+j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
