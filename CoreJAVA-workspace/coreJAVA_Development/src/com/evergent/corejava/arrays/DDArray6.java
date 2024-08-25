package com.evergent.corejava.arrays;

public class DDArray6 {

	public static void main(String[] args) {
		String a[][]=new String[5][5];
		 
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				  a[i][j]="java";
			 }
		 }
		 
		 for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

	}

}
