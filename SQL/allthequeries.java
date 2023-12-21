package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class allthequeries {

    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);

        // SQL statement with placeholders for three columns
        String sql = "INSERT INTO student (id, name, email) VALUES (?, ?, ?)";
        PreparedStatement prepared = conn.prepareStatement(sql);

        // Set values for the placeholders (?, ?, ?)
        prepared.setInt(1, 101);         // Assuming id is the first column
        prepared.setString(2, "ALI");    // Assuming name is the second column
        prepared.setString(3, "ali@gmail.com");  // Assuming email is the third column
        
        prepared.setInt(1, 102);         // Assuming id is the first column
        prepared.setString(2, "sham");    // Assuming name is the second column
        prepared.setString(3, "sham@gmail.com");  // Assuming email is the third column

        prepared.setInt(1, 103);         // Assuming id is the first column
        prepared.setString(2, "bahadur");    // Assuming name is the second column
        prepared.setString(3, "bahadur@gmail.com");  // Assuming email is the third column
        
        prepared.setInt(1, 104);         // Assuming id is the first column
        prepared.setString(2, "bahadur");    // Assuming name is the second column
        prepared.setString(3, "bahadur@gmail.com");  // Assuming email is the third column
        
        // Execute the query
        int rowsAffected = prepared.executeUpdate();

        System.out.println(rowsAffected + " row(s) affected");

        // Close the resources
        prepared.close();
        conn.close();
    }
}

