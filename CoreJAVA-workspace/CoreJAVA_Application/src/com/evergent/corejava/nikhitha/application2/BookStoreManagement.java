package com.evergent.corejava.nikhitha.application2;

import java.util.Scanner;

public class BookStoreManagement {

    enum MainMenuOption {B, V, M, E}
    enum BookCategory {H, S, A, M}
    enum AcademicCategory {O, F, T, S, M}
    enum PaymentOption {V, P, M}
    
    static Scanner scanner = new Scanner(System.in);
    static int totalAmount = 0;
    static int discount = 0;
    
    static String[] history= {"Ancient History", "Medieval History", "Modern History"};
    static String[] story= {"Fables", "Fairy Tales", "Mythology"};
    static String[] academic1= {"Math", "Science", "English"};
    static String[] academic2= {"Physics", "Chemistry", "Biology"};
    static String[] academic3= {"Algebra", "Geometry", "Trigonometry"};
    static String[] academic4= {"Calculus", "Statistics", "Discrete Math"};
    
    static int[] hPrice= {300,400,500};
    static int[] sPrice= {200,300,400};
    static int[] a1Price= {100,150,200};
    static int[] a2Price= {200,250,300};
    static int[] a3Price= {300,350,400};
    static int[] a4Price= {400,450,500};
    

    public static void main(String[] args) {
        while (true) {
            
            System.out.println("\n======================");
            System.out.println(" BOOK STORE Main Menu");
            System.out.println("======================");
            System.out.println("B - Buy Book");
            System.out.println("V - View All Books");
            System.out.println("M - Take Membership");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your choice (B, V, M, E): ");
            
            String choice = scanner.nextLine().toUpperCase();
            switch (MainMenuOption.valueOf(choice)) {
                case B:
                    while (true) {
                        System.out.println("\n======================");
                        System.out.println(" Book Categories");
                        System.out.println("======================");
                        System.out.println("H - History");
                        System.out.println("S - Story Telling");
                        System.out.println("A - Academic");
                        System.out.println("M - Return to Prior Menu");
                        System.out.println("======================");
                        System.out.print("Enter your choice (H, S, A, M): ");
                        
                        String bookChoice = scanner.nextLine().toUpperCase();
                        switch (BookCategory.valueOf(bookChoice)) {
                            case H:
                                viewBooks("History", history, hPrice);
                                break;
                            case S:
                                viewBooks("Story Telling", story,sPrice);
                                break;
                            case A:
                                while (true) {
                                    System.out.println("\n======================");
                                    System.out.println(" Academic Categories");
                                    System.out.println("======================");
                                    System.out.println("O - Class 1 to 5");
                                    System.out.println("F - Class 5 to 10");
                                    System.out.println("T - Class 10 to 12");
                                    System.out.println("S - Class 12 to 16");
                                    System.out.println("M - Return to Prior Menu");
                                    System.out.println("======================");
                                    System.out.print("Enter your choice (O, F, T, S, M): ");
                                    
                                    String acadChoice = scanner.nextLine().toUpperCase();
                                    switch (AcademicCategory.valueOf(acadChoice)) {
                                        case O:
                                            viewBooks("Class 1 to 5", academic1,a1Price);
                                            break;
                                        case F:
                                            viewBooks("Class 5 to 10", academic2, a2Price);
                                            break;
                                        case T:
                                            viewBooks("Class 10 to 12",academic3,a3Price);
                                            break;
                                        case S:
                                            viewBooks("Class 12 to 16", academic4, a4Price);
                                            break;
                                        case M:
                                            break;
                                    }
                                    if (acadChoice.equals("M")) break;
                                }
                                break;
                            case M:
                                break;
                        }
                        if (bookChoice.equals("M")) break;
                    }
                    break;
                case V:
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
                    scanner.nextLine();
                    break;
                case M:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter your gender (M/F): ");
                    String gender = scanner.nextLine().toUpperCase();

                    int membershipAmount = (age >= 18) ? 200 : 150;
                    System.out.println("Membership amount is: Rs " + membershipAmount);

                    while (true) {
                        System.out.println("Do you want to proceed to payment? (Y/N) or (M) to return to the prior menu: ");
                        String paymentChoice = scanner.nextLine().toUpperCase();
                        if (paymentChoice.equals("Y")) {
                            System.out.println("Payment successful! Membership confirmed for " + name + ", age " + age + ", gender " + gender + ".");
                            
                                System.out.println("\nCongratulations on becoming a member! Here are some of your benefits:");
                                System.out.println("1. Discount on all future purchases.");
                                System.out.println("2. Access to exclusive members-only sales.");
                                System.out.println("3. Priority customer support.");
                                 
                            
                            break;
                        } else if (paymentChoice.equals("M")) {
                            break;
                        } else if (paymentChoice.equals("N")) {
                            System.out.println("Returning to main menu without membership.");
                            break;
                        }
                    }
                    break;
                case E:
                    System.out.println("Exiting the store... Have a Good Day!!!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void viewBooks(String category, String[] subjects, int[] prices) {
        while (true) {
            System.out.println("\n======================");
            System.out.println(" " + category + " Books");
            System.out.println("======================");
            for (int i = 0; i < subjects.length; i++) {
                System.out.println((i + 1) + " - " + subjects[i] + " (Rs " + prices[i] + ")");
            }
            System.out.println("M - Return to Prior Menu");
            System.out.println("======================");
            System.out.print("Enter your choice (1-" + subjects.length + ", M): ");
            
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("M")) return;
            
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < subjects.length) {
                System.out.print("Enter quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                int amount = prices[index] * quantity;
                System.out.println("You chose " + subjects[index] + " - Quantity: " + quantity + " - Total: Rs " + amount);
                totalAmount += amount;
                applyDiscount();
                while (true) {
                    System.out.println("\n======================");
                    System.out.println(" Payment Options");
                    System.out.println("======================");
                    System.out.println("V - View Total Amount");
                    System.out.println("P - Make Payment");
                    System.out.println("M - Return to prior Menu");
                    System.out.println("======================");
                    System.out.print("Enter your choice (V, P, M): ");
                    
                    String paymentChoice = scanner.nextLine().toUpperCase();
                    switch (PaymentOption.valueOf(paymentChoice)) {
                        case V:
                            System.out.println("Total amount to be paid: Rs " + totalAmount);
                            System.out.println("Discount: Rs " + discount);
                            System.out.println("Amount after discount: Rs " + (totalAmount - discount));
                            break;
                        case P:
                            System.out.println("Payment successful! Total amount paid: Rs " + (totalAmount - discount));
                            totalAmount = 0;
                            discount = 0;
                            break;
                        case M:
                            return;
                    }
                }
            }
        }
    }

    public static void applyDiscount() {
        if (totalAmount > 2000) {
            discount = 300;
        } else if (totalAmount > 1500) {
            discount = 150;
        } else if (totalAmount > 1000) {
            discount = 100;
        } else if (totalAmount > 500) {
            discount = 50;
        } else {
            discount = 0;
        }
    }
}
