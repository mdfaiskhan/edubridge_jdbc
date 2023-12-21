package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement st = conn.createStatement();
		String q1="delete from student where id=105";
		int row=st.executeUpdate(q1);
		System.out.println("row deleted"+row);

	}

}
