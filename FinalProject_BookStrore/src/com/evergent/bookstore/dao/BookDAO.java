 
package com.evergent.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.bookstore.bean.*;

public class BookDAO {

    Connection con = null;
    PreparedStatement pstmt = null;
    
    public int addBook(BookBean book) {
        try {
            con = BookDBConnection.getConnection();
            String query = "INSERT INTO books (bookId, title, author, price) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setDouble(4, book.getPrice());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
    
    public BookBean getBook(int bookId) {
        BookBean book = new BookBean();
        try {
            con = BookDBConnection.getConnection();
            String query = "SELECT * FROM books WHERE bookId = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                book.setBookId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPrice(rs.getDouble(4));
            }
            con.close();
            return book;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public int updateBookPrice(int bookId, double price) {
        try {
            con = BookDBConnection.getConnection();
            String query = "UPDATE books SET price = ? WHERE bookId = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setDouble(1, price);
            pstmt.setInt(2, bookId);
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
    
    public int deleteBook(int bookId) {
        try {
            con = BookDBConnection.getConnection();
            String query = "DELETE FROM books WHERE bookId = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
}