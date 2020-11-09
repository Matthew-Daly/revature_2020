package com.app.ironbank.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostresSqlConnection {

	private static Connection connection;
	
	private PostresSqlConnection() {;
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//load Driver	
		Class.forName(DBUtilProps.DRIVER);

		//open connection
		String url = DBUtilProps.URL;
		String password = "Gain45dig";
		String username = "postgres";
		connection=DriverManager.getConnection(url, username, password);
		System.out.println("Connected!");
		return connection;
		
	}
	
	
}
