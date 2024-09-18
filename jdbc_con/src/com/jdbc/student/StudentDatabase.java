package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabase {
	
 
	private static Connection conn = null;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 try {
			 StudentDatabase s1 = new StudentDatabase();
			 String dbUrl = "jdbc:mysql://localhost:3306/students";
			 String username = "root";
			 String Password = "deepak@987";
			 Class.forName("com.mysql.cj.jdbc.Driver");
		  conn = DriverManager.getConnection(dbUrl,username,Password);
		  System.out.println("Database is connected");
		  System.out.println("Enter the Choice");
		  System.out.println("1. Insert The Record");
		  int choice = Integer.parseInt(sc.nextLine());
			 switch (choice) {
			case 1:
				s1.insertData();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		 }
		 catch(Exception e) {
			 throw new RuntimeException("Something went to wrong");
		 }

	}
	private void insertData() throws SQLException {
		String sql = "insert into student(name,percentage,address) values ('Raj',85.5,'Mumbai') ";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		int row = preparedStatement.executeUpdate();
		if(row>0) {
			System.out.println("inserted successfully");
		}
	}

}
 