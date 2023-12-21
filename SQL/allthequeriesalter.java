package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class allthequeriesalter {

    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/jdbc";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);

        // SQL statement to add a new column "email" to the "student" table
        String sql = "ALTER TABLE student ADD COLUMN dob VARCHAR(255)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // Execute the ALTER TABLE statement
        preparedStatement.executeUpdate();
        System.out.println("Table altered successfully");

        // Close the resources
        preparedStatement.close();
        conn.close();
    }
}

