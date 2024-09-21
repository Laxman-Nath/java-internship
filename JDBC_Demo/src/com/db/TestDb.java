package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
public static void main(String [] args) throws ClassNotFoundException, SQLException {
	// Register driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","siddha@123");
	
	
	// Transaction
	// -------------------- insert sql --------------------
	// a. write sql
//	   String sql="Insert into user(username,password) values('harish','22')";
//	   String sql="Select * from user";
//	    String sql="Update user set username='laxman' where id=1";
	   String sql="Delete from user where id=1";
	// b. create statements
	   Statement stm=conn.createStatement();
	   
	// c. execute sql
//	    stm.execute(sql);
//	    System.out.println("Inserted successfully!");
	   
//	       ResultSet rs= stm.executeQuery(sql);
//	       while(rs.next()) {
//	    	   System.out.println("Id="+rs.getInt("id"));
//	    	   System.out.println("Username="+rs.getString("username"));
//	    	   System.out.println("Password="+rs.getString("Password"));
//	       }
	   
//	   int affectedRows=stm.executeUpdate(sql);
//	   if(affectedRows>0) {
//		   System.out.println("Successfully updated");
//	   }
//	   else {
//		   System.out.println("Error updating");
//	   }
	   
	   int affectedRows=stm.executeUpdate(sql);
	   if(affectedRows>0) {
		   System.out.println("Successfully deleted");
	   }
	   else {
		   System.out.println("Error deleting");
	   }
	// d. close db
	   conn.close();
	   
}
}
