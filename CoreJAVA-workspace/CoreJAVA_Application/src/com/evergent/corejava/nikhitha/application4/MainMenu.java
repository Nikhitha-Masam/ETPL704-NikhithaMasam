package com.evergent.corejava.nikhitha.application4;


public class MainMenu {
    public MainMenu() {
        System.out.println("Main Menu initialized");
    }

    public void display() {
        while (true) {
            System.out.println("\n======================");
            System.out.println(" BOOK STORE Main Menu");
            System.out.println("======================");
            System.out.println("1 - Buy Book");
            System.out.println("2 - View All Books");
            System.out.println("3 - Take Membership");
            System.out.println("4 - Exit");
            System.out.println("======================");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(BookStoreManagement.scanner.nextLine());
            MenuAction action = null;
            switch (choice) {
                case 1:
                    action = new BuyBookAction(this);  
                    break;
                case 2:
                    action = new ViewAllBooksAction();
                    break;
                case 3:
                    action = new MembershipAction();
                    break;
                case 4:
                    System.out.println("Exiting the store... Have a Good Day!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (action != null) {
                action.execute();
            }
        }
    }
}