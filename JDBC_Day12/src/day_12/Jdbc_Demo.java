package day_12;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 1.we need to import package
2.load and register the driver - com.mysql.jdbc.driver
3.establish the connection
4.create the statements
5.execute the query
6.process results
7.close the connection*/

public class Jdbc_Demo {
    public static void main(String[] args) {
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Connect to MySQL Database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC",  // URL
                    "root",                                   // username
                    "Stromhc_28");                         // password
            
            System.out.println("Connected to Database!");

            // 3. Create Statement
            Statement stmt = conn.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM sample");

            // 5. Process Result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + 
                                   rs.getString("name") + " | " + 
                                   rs.getInt("age"));
            }

            // 6. Close Connection
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
