package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
public static Connection getConn() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/web_db","root","siddha@123");
		return conn;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return null;
}
}
