package com.evergent.corejava.nikhitha.application4;

public class Payment {
    public static void processPayment() {
        Discount.applyDiscount();
        while (true) {
            System.out.println("\n======================");
            System.out.println(" Payment Options");
            System.out.println("======================");
            System.out.println("1 - View Total Amount");
            System.out.println("2 - Make Payment");
            System.out.println("3 - Return to Prior Menu");
            System.out.println("======================");
            System.out.print("Enter your choice: ");

            int paymentChoice = Integer.parseInt(BookStoreManagement.scanner.nextLine());
            switch (paymentChoice) {
                case 1:
                    System.out.println("Total amount to be paid: Rs " + BookStoreManagement.totalAmount);
                    System.out.println("Discount: Rs " + BookStoreManagement.discount);
                    System.out.println("Amount after discount: Rs " + (BookStoreManagement.totalAmount - BookStoreManagement.discount));
                    break;
                case 2:
                    System.out.println("Payment successful! Total amount paid: Rs " + (BookStoreManagement.totalAmount - BookStoreManagement.discount));
                    BookStoreManagement.totalAmount = 0;
                    BookStoreManagement.discount = 0;
                    return;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}