package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class allthequeriesdelete {

    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/jdbc";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);

        // SQL statement to delete a record with ID 104
        String sql = "DELETE FROM student WHERE id = ?";
        PreparedStatement prepared = conn.prepareStatement(sql);

        // Set the value for the placeholder (?)
        prepared.setInt(1, 104); // Assuming ID is an integer
        //prepared.setInt(1, 103); // Assuming ID is an integer
        //prepared.setInt(1, 102); // Assuming ID is an integer
        //prepared.setInt(1, 101); // Assuming ID is an integer
        // Execute the query
        int rowsAffected = prepared.executeUpdate();

        System.out.println(rowsAffected + " row(s) affected");

        // Close the resources
        prepared.close();
        conn.close();
    }
}
