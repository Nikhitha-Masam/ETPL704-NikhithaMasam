package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		try {
			File file=new File("C:/mydata/myInfo.txt"); //file path
			Scanner scanner=new Scanner(file); //read the given file
			while(scanner.hasNextLine()) {
				System.out.print(scanner.nextLine());
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
