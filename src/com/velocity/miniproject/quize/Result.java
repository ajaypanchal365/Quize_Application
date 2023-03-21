package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Result {
	
	public static void getResult() {
		
		try {
			Connection con = CommonConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update student set mark=? where UserName=?");
			
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter your User Name to Store your marks");
		    String username=scanner.nextLine();
		    
		    System.out.println("Enter your Mark");
		    int mark=scanner.nextInt();
		    
		    ps.setInt(1, mark);
		    ps.setString(2, username);
		    ps.executeUpdate();
		    		    
		    } catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
