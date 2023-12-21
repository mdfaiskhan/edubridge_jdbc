package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class allthequeriesupdate {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc";
		
		 Class.forName(driver);
	        Connection conn = DriverManager.getConnection(url, username, password);

	        // SQL statement to delete a record with ID 104
	        String sql = "update student set name=? where id=?";
	        PreparedStatement prepared = conn.prepareStatement(sql);
		
	        prepared.setInt(2, 102);
	        prepared.setString(1, "roshan");
	        
	        prepared.setInt(2, 104);
	        prepared.setString(1, "Radhe");
	        int rowsAffected = prepared.executeUpdate();

	        System.out.println(rowsAffected + " row(s) updated");
		

	}

}
