package com.app.ironbank.dao.impl;

public class TransactionQueries {
	
	public static final String INSERTTRANSACTION= "INSERT INTO theironbank.ironbank.transactions(transaction_id, transaction_type, transaction_amount, account_id) VALUES (?, ?, ?, ?)";
	public static final String GETTRANSACTIONBYID= "SELECT transaction_id, transaction_type, transaction_amount, account_id FROM theironbank.ironbank.transactions where transaction_id=?";
}