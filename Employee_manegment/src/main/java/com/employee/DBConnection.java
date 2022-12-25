package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static String url =  "jdbc:mysql://localhost:3306/user_profile";
	private static String userName = "root";
	private static String password = "s1apooth11.";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
			
		}
		catch(Exception e) {
			System.out.println("Database connection is not success");
		}
		
		return con;
	}
}
