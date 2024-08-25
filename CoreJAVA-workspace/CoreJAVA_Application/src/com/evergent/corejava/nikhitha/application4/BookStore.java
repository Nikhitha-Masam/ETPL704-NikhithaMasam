package com.evergent.corejava.nikhitha.application4;

public class BookStore {
    public void displayCategories() {
        while (true) {
            System.out.println("\n======================");
            System.out.println(" Book Categories");
            System.out.println("======================");
            System.out.println("1 - History");
            System.out.println("2 - Story Telling");
            System.out.println("3 - Academic");
            System.out.println("4 - Return to Prior Menu");
            System.out.println("======================");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(BookStoreManagement.scanner.nextLine());
            if (choice == 4) return;

            BookCategory category = null;
            switch (choice) {
                case 1:
                    category = new HistoryCategory();
                    break;
                case 2:
                    category = new StoryCategory();
                    break;
                case 3:
                    category = new AcademicCategory();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            if (category != null) {
                category.displayBooks();
            }
        }
    }
}