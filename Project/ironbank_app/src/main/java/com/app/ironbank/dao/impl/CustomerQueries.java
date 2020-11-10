package com.app.ironbank.dao.impl;

public class CustomerQueries {

 	public static final String INSERTCUSTOMER= "INSERT INTO theironbank.ironbank.customers(DEFAULT, firstname, lastname, username, password, email) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String GETCUSTOMERBYID= "SELECT firstname, lastname, username, password, email FROM theironbank.ironbank.customers where customer_id=?";
	public static final String GETCUSTOMERBYUSERNAME= "SELECT customer_id, firstname, lastname, username, password, email FROM theironbank.ironbank.customers where username=?";
}

 

