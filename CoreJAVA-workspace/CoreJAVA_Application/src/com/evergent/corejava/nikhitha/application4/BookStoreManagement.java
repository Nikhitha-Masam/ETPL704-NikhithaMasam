package com.evergent.corejava.nikhitha.application4;
import java.util.Scanner;
public class BookStoreManagement {
    static Scanner scanner = new Scanner(System.in);
    static int totalAmount = 0;
    static int discount = 0;

    static {
        System.out.println("Welcome to the Book Store!");
     
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.display();
    }
}