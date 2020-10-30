package com.app.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {

	public static void main(String[] args) {
		
	    Connection connection=null;
		try {
			//step 1 - load/reg drive
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Well Done!");
			//step 2 - open connection(url, username, password)
			String url="jdbc:postgresql://localhost:5432/postgres";			
			String username="postgres";
			String password="Gain45dig";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successfull!");
			
			//step 3 - Create statement
			Statement statement=connection.createStatement();
			String sql="select id,name,age,gender,teamName,contact from roc_revature.player";
			
			System.out.println("Statment Created!");
			
			//step 4 - Execute Query 
			ResultSet rs=statement.executeQuery(sql); 	
			System.out.println("Queary Exectued!");
			
			//step 5 Process Results
			while(rs.next()) {
				System.out.println("ID = " + rs.getInt("id"));
				System.out.println("Name = " + rs.getString("name"));
				System.out.println("Gender = " + rs.getString("gender"));
				System.out.println("TeameName = " + rs.getString("teamName"));
				System.out.println(("Contact = " + rs.getLong("contact") + "\n"));
			}
			System.out.println("Results Processed");
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);;	
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			//step 6 - close connection
			try {
				connection.close();
				System.out.println("Closed Connection");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}

}

