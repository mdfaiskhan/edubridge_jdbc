package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectiondemo {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc";
		
		//2.load driver
		Class.forName(driver);
		
		//3. create connection object
		Connection conn=DriverManager.getConnection(url,username,password);
		
		//4. create statment object
		Statement st=conn.createStatement();
		
		String q1="select * from student";
		
		ResultSet rs= st.executeQuery(q1);
		
		System.out.println("Successfully connected");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getString(3));
		}
				
	}

}
