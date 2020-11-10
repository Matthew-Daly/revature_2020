package com.app.ironbank.dao.impl;

	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.ironbank.dao.AccountDao;
import com.app.ironbank.dbutil.PostresSqlConnection;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public int createAccount(Account account)throws BusinessException{
		int c=0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql=AccountQueries.INSERTACCOUNT;
		    PreparedStatement preparedStatement=connection.prepareStatement(sql);
		    preparedStatement.setInt(1, account.getAccount_id());
		    preparedStatement.setFloat(2, account.getBalance());
		    preparedStatement.setInt(3, account.getCustomer_id());
		    		    
		    
		    c=preparedStatement.executeUpdate();
		    
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //testing only remove for production
			throw new BusinessException("Internal error occured...please contact SYSADMIN");
		}		
		return c;
	}

@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccountByID(int account_id) throws BusinessException {
		Account account = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = AccountQueries.GETACCOUNTBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, account_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
			 account = new Account(account_id, resultSet.getInt("account_id"), resultSet.getInt("balance"));
			}else {
				throw new BusinessException("Invalid ID!!!... No matching records found for the ID = "+account_id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. please contact SYSADMIN");
		}
		return account;
	}

}

