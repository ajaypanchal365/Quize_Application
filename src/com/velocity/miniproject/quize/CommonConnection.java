package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CommonConnection {

	public static Connection getConnection() throws SQLException {
	
		Connection connection= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}