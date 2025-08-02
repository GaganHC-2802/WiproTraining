package day_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.driver");
		}catch(ClassNotFoundException e) {
			System.out.println("Class not found" + e);
		}
		System.out.println("Class found");
		int no_of_rows = 0;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Stromhc_28");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while(rs.next()) {
				no_of_rows++;
			}
			System.out.println("There are"+no_of_rows+"in the table");
			conn.close();
		}catch(SQLException e) {
			System.out.println("SQL Exception"+e);
		}
	}

}
