package com.app.ironbank.dao;

import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Account;

public interface AccountDao {


	public int createAccount(Account account_id)throws BusinessException;
	public void deleteAccount(int account_id)throws BusinessException;
	public Account getAccountByID(int account_id)throws BusinessException;
	
}
