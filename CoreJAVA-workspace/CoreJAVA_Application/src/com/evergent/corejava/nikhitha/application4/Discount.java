package com.evergent.corejava.nikhitha.application4;


public class Discount {
    public static void applyDiscount() {
        if (BookStoreManagement.totalAmount > 2000) {
            BookStoreManagement.discount = 300;
        } else if (BookStoreManagement.totalAmount > 1500) {
            BookStoreManagement.discount = 150;
        } else if (BookStoreManagement.totalAmount > 1000) {
            BookStoreManagement.discount = 100;
        } else if (BookStoreManagement.totalAmount > 500) {
            BookStoreManagement.discount = 50;
        } else {
            BookStoreManagement.discount = 0;
        }
    }
}