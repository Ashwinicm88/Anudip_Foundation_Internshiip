package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Ashwini@26");

        // Create a statement
        Statement stmt = con.createStatement();

        // Execute the SQL query to insert data into the table
        final int rowsAffected = stmt.executeUpdate("INSERT INTO student VALUES(2,'Aishu','hyderabad')");

        System.out.println("Successfully added student data. Rows affected: " + rowsAffected);

        // Close the connection
        con.close();
    }
}