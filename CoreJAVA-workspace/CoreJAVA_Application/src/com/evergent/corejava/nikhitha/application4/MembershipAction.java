package com.evergent.corejava.nikhitha.application4;

public class MembershipAction implements MenuAction {
    public MembershipAction() {
        System.out.println("MembershipAction initialized");
    }

    @Override
    public void execute() {
        System.out.print("Enter your name: ");
        String name = BookStoreManagement.scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(BookStoreManagement.scanner.nextLine());
        System.out.print("Enter your gender (M/F): ");
        String gender = BookStoreManagement.scanner.nextLine().toUpperCase();

        int membershipAmount = (age >= 18) ? 200 : 150;
        System.out.println("Membership amount is: Rs " + membershipAmount);

        while (true) {
            System.out.println("Do you want to proceed to payment? (Y/N) or (M) to return to the prior menu: ");
            String paymentChoice = BookStoreManagement.scanner.nextLine().toUpperCase();
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
    }
}