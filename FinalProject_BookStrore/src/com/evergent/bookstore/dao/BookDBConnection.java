 
package com.evergent.bookstore.dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class BookDBConnection {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "admin");
    }
}