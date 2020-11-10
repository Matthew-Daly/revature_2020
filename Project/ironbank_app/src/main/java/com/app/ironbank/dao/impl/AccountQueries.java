	package com.app.ironbank.dao.impl;

public class AccountQueries {
	
	public static final String INSERTACCOUNT= "INSERT INTO theironbank.ironbank.accounts(account_id, balance, customer_id) VALUES (?, ?, ?)";
	public static final String GETACCOUNTBYID= "SELECT account_id, balance, customer_id FROM theironbank.ironbank.accounts where account_id=?";
}
