package com.evergent.bookstore.service;
 

import com.evergent.bookstore.bean.*;
import com.evergent.bookstore.dao.*;

public class BookService {

    BookDAO bookDAO = new BookDAO();

    public int addBook(int bookId, String title, String author, double price) {
        BookBean book = new BookBean();
        book.setBookId(bookId);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        return bookDAO.addBook(book);
    }

    public BookBean getBookDetails(int bookId) {
        return bookDAO.getBook(bookId);
    }

    public int updatePrice(int bookId, double price) {
        return bookDAO.updateBookPrice(bookId, price);
    }

    public int deleteBook(int bookId) {
        return bookDAO.deleteBook(bookId);
    }
}