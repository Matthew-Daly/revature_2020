///am consolidating this into account - may not be used in final app
package com.app.ironbank.dao;

import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Transaction;


public interface TransactionDao {

	public int createTransaction(Transaction transaction)throws BusinessException;
	public void deleteTransaction(int transaction_id)throws BusinessException;
	public Transaction getTransactionByID(int transaction_id)throws BusinessException;

}




