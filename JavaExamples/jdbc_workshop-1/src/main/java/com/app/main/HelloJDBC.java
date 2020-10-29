package com.app.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			System.out.println("Connection Successfull");
			
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

