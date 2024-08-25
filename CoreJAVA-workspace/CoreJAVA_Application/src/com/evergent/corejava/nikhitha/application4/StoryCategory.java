package com.evergent.corejava.nikhitha.application4;

public class StoryCategory extends BookCategory {
    public StoryCategory() {
        super();
        books = new String[]{"Fables", "Fairy Tales", "Mythology"};
        prices = new int[]{200, 300, 400};
    }

    @Override
    public void displayBooks() {
        System.out.println("\n======================");
        System.out.println(" Story Books");
        System.out.println("======================");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + " - " + books[i] + " (Rs " + prices[i] + ")");
        }
        processBookSelection();
    }
}