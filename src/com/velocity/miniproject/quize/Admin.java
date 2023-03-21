package com.velocity.miniproject.quize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Admin implements AdminLogin {

	public void getQuestion() {
		try {
			Connection con=CommonConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into question(question,Option_1,Option_2,Option_3,Option_4,correct_answer) values (?,?,?,?,?,?)");
			
			for (int j=1;j<=10;j++) {
			System.out.println("Enter the Question");
			Scanner scanner = new Scanner(System.in);
			String question1= scanner.nextLine();
			String Option_1=scanner.nextLine();
			String Option_2=scanner.nextLine();
			String Option_3=scanner.nextLine();
			String Option_4=scanner.nextLine();
			System.out.println("Enter Correct Answer");
			String ca=scanner.nextLine();
						
			ps.setString(1, question1);
			ps.setString(2, Option_1);
			ps.setString(3, Option_2);
			ps.setString(4, Option_3);
			ps.setString(5, Option_4);
			ps.setString(6, ca);
		    int i=ps.executeUpdate();
		    System.out.println("Record is Entered Successfully" +i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void fetchResult() {
		
		try {
			Connection con=CommonConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select firstName, LastName,mark from student where studentId=?");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter StudentId for Result");
			int studid= scanner.nextInt();
			ps.setInt(1,studid);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				
				System.out.println(" First Name -"  +rs.getString(1));
				System.out.println(" Last Name -"  +rs.getString(2));
				System.out.println(" Marks -"  +rs.getInt(3));
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void allResult() {
		try {
			Connection con=CommonConnection.getConnection();
		   	String sql= "select *from student order by mark asc";
		    Statement statment = con.createStatement();
		    
		    ResultSet rs = statment.executeQuery(sql);
		   
		    while(rs.next()) {
		    	
		      	System.out.println(" StudentID -"  +rs.getInt(1));
		    	System.out.println(" FirstName -"  +rs.getString(2));
				System.out.println(" LastName -"  +rs.getString(3));
				System.out.println(" UserName -"  +rs.getString(4));
		    	System.out.println(" Password -"  +rs.getString(5));
				System.out.println(" City -"  +rs.getString(6));
				System.out.println(" Mobile Number -"  +rs.getInt(7));
				System.out.println(" Mail Id -"  +rs.getString(8));
				System.out.println(" Marks -"  +rs.getInt(9));
		    			
				
		    }
		}
		    		    	
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Admin admin= new Admin();
		System.out.println("Welcome to Quize application");
		System.out.println("1. Enter Question in Question Bank");
		System.out.println("2. Get the Student Result by their StudentId");
		System.out.println("3. Get all Student Result");
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		switch(number) {
		
		case 1:admin.getQuestion();
		break;
		case 2:admin.fetchResult();
		break;
		case 3:admin.allResult();
		}
		
	}
}
