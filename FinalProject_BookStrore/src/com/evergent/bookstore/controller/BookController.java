package com.evergent.bookstore.controller;

import java.util.Scanner;
import com.evergent.bookstore.service.*;
import com.evergent.bookstore.bean.*;
public class BookController {
    public static void main(String args[]) {
        int bookId = 0;
        String title = "";
        String author = "";
        double price = 0;
        int ch, ch1 = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("------------------------WELCOME TO THE BOOK STORE---------------------");
        BookService bookService = new BookService();
        
        while (ch1 != 0) {
            System.out.println("1. Add a New Book");
            System.out.println("2. Show Book Details");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete a Book");
            System.out.println("Enter your choice:");
            ch = s.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.println("Enter Book ID:");
                    bookId = s.nextInt();
                    System.out.println("Enter Book Title:");
                    title = s.next();
                    System.out.println("Enter Author Name:");
                    author = s.next();
                    System.out.println("Enter Price:");
                    price = s.nextDouble();
                    int updateCount = bookService.addBook(bookId, title, author, price);
                    System.out.println(updateCount + " Book Added Successfully");
                    break;
                    
                case 2:
                    try {
                        System.out.println("Enter the Book ID:");
                        int id = s.nextInt();
                        BookBean book = bookService.getBookDetails(id);
                        System.out.println("Book Details:\nTitle: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nPrice: " + book.getPrice());
                    } catch (Exception e) { e.printStackTrace(); }
                    break;
                    
                case 3:
                    try {
                        System.out.println("Enter the Book ID:");
                        int id = s.nextInt();
                        System.out.println("Enter the new price:");
                        double newPrice = s.nextDouble();
                        bookService.updatePrice(id, newPrice);
                        System.out.println("Price Updated Successfully");
                    } catch (Exception e) { e.printStackTrace(); }
                    break;
                    
                case 4:
                    try {
                        System.out.println("Enter the Book ID to delete:");
                        int id = s.nextInt();
                        bookService.deleteBook(id);
                        System.out.println("Book Deleted Successfully");
                    } catch (Exception e) { e.printStackTrace(); }
                    break;
                    
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
            
            System.out.println("\nEnter 1 to perform more operations and 0 for exit:");
            ch1 = s.nextInt();
        }
    }
}