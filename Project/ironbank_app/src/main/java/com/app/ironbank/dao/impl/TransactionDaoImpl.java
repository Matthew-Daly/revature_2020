package com.app.ironbank.dao.impl;

	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.ironbank.dao.TransactionDao;
import com.app.ironbank.dbutil.PostresSqlConnection;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Transaction;

public class TransactionDaoImpl implements TransactionDao {

	@Override
	public int createTransaction(Transaction transaction)throws BusinessException{
		int c=0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql=TransactionQueries.INSERTTRANSACTION;
		    PreparedStatement preparedStatement=connection.prepareStatement(sql);
		    preparedStatement.setInt(1, transaction.getTransaction_id());
		    preparedStatement.setString(2, transaction.getType());
		    preparedStatement.setInt(3, transaction.getAmmount());
		    preparedStatement.setInt(4, transaction.getAccount_id());

		    		    
		    
		    c=preparedStatement.executeUpdate();
		    
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //testing only remove for production
			throw new BusinessException("Internal error occured...please contact SYSADMIN");
		}		
		return c;
	}

@Override
	public void deleteTransaction(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction getTransactionByID(int transaction_id) throws BusinessException {
		Transaction transaction = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = TransactionQueries.GETTRANSACTIONBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, transaction_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
			 transaction = new Transaction(transaction_id, resultSet.getString("transaction_type"), resultSet.getInt("transaction_ammount"), resultSet.getInt("account_id"));
			}else {
				throw new BusinessException("Invalid ID!!!... No matching records found for the ID = "+transaction_id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. please contact SYSADMIN");
		}
		return transaction;
	}

}

