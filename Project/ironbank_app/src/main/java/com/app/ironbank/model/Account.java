package com.app.ironbank.model;

public class Account {

	private int account_id;
	private float balance;
	private int customer_id;
	
	public Account() {
	
	}
	
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", balance=" + balance + ", customer_id=" + customer_id + "]";
	}

	public Account(int account_id, float balance, int customer_id) {
		super();
		this.account_id = account_id;
		this.balance = balance;
		this.customer_id = customer_id;
	}

	

	
}