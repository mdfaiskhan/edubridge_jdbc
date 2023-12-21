package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class allthequeriesdrop {

    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/jdbc";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);

        // SQL statement to drop the "email" column from the "student" table
        String sql = "ALTER TABLE student DROP COLUMN address";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // Execute the ALTER TABLE statement
        preparedStatement.executeUpdate();
        System.out.println("Column dropped successfully");

        // Close the resources
        preparedStatement.close();
        conn.close();
    }
}

