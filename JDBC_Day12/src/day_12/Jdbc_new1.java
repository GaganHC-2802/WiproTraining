package day_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_new1 {

	public static void main(String[] args) throws SQLException {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Stromhc_28");	
				System.out.println("Database connection success...");
			}catch(ClassNotFoundException e) {
				System.out.println("Connection unsuccessful");
			}
		
	}

}
