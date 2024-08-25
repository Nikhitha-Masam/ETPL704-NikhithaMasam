package com.evergent.corejava.generalprogramming;
import java.util.*;
public class Patternb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		 for(int i=1;i<=(2*n-1);i++) {
			 if(i<=n)
			 {
				 count=i;
			 }
			 else {
				 count=(2*n-i);
			 }
			 for(int j=1;j<=count;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
