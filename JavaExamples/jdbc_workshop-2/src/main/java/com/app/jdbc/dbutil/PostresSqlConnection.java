package com.app.jdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostresSqlConnection {
	
	private static Connection connection;
	
	private PostresSqlConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgres.Driver");
		String url="jdbc:postgresql://localhost:5432/postgres";			
		String username="postgres";
		String password="postgres";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
		
	}
	
	
}
//this is a creational pattern - Single TON JAVA Class. resusing connection whenever we need it 