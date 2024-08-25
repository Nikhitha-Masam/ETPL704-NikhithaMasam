package com.evergent.corejava.nikhitha.application4;

public class HistoryCategory extends BookCategory {
    public HistoryCategory() {
        super();
        books = new String[]{"Ancient History", "Medieval History", "Modern History"};
        prices = new int[]{300, 400, 500};
    }

    @Override
    public void displayBooks() {
        System.out.println("\n======================");
        System.out.println(" History Books");
        System.out.println("======================");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + " - " + books[i] + " (Rs " + prices[i] + ")");
        }
        processBookSelection();
    }
}