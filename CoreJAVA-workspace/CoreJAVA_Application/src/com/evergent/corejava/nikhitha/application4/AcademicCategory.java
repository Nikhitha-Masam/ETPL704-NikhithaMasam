package com.evergent.corejava.nikhitha.application4;
public class AcademicCategory extends BookCategory {
    public AcademicCategory() {
        super();
        books = new String[]{"Math", "Science", "English"};
        prices = new int[]{100, 150, 200};
    }

    @Override
    public void displayBooks() {
        System.out.println("\n======================");
        System.out.println(" Academic Books");
        System.out.println("======================");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + " - " + books[i] + " (Rs " + prices[i] + ")");
        }
        processBookSelection();
    }
}