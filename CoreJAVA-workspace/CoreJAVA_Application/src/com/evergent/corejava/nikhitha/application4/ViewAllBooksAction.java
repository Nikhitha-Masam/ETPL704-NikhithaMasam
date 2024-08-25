package com.evergent.corejava.nikhitha.application4;

public class ViewAllBooksAction implements MenuAction {
    public ViewAllBooksAction() {
        System.out.println("ViewAllBooksAction initialized");
    }

    @Override
    public void execute() {
        System.out.println("\n======================");
        System.out.println(" Available Books");
        System.out.println("======================");
        System.out.println("1 - Ancient History");
        System.out.println("2 - Tales");
        System.out.println("3 - Math");
        System.out.println("4 - Physics");
        System.out.println("5 - Story books");
        System.out.println("6 - Physics");
        System.out.println("7 - Calculus");
        System.out.println("8 - Discrete Math");
        System.out.println("9 - Statistics");
        System.out.println("10 - Mythology");
        System.out.println("======================");
        System.out.print("Enter m to return to Prior Menu: ");
        BookStoreManagement.scanner.nextLine();
    }
}