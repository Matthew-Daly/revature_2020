package com.app.ironbank.model;

public class Transaction {


	private int transaction_id;
	private String type;
	private int ammount;
	private int account_id;

	public int getTransaction_id() {
		return transaction_id;
	}
	
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", type=" + type + ", ammount=" + ammount
				+ ", account_id=" + account_id + "]";
	}
	public Transaction() {
		
	}
	
	public Transaction(int transaction_id, String type, int ammount, int account_id) {
		super();
		this.transaction_id = transaction_id;
		this.type = type;
		this.ammount = ammount;
		this.account_id = account_id;
	}

	
}