	package com.app.ironbank.dao.impl;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.ironbank.dao.CustomerDao;
import com.app.ironbank.dbutil.PostresSqlConnection;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	// private static CustomerDaoImpl customerDao;
	// final static Logger log = Logger.getLogger(CustomerDaoImpl.class);
	
	// private UserImplDao() {
	// }
	// public static UCustomerDaoImpl getCustmerDao(){
	// 	if (customerDao == null){
	// 		customerDao = new UserImplDao();
	// 	}
	// 	return customerDao;
	
	
	@Override
	public int createCustomer(Customer customer)throws BusinessException{
		int c=0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql=CustomerQueries.INSERTCUSTOMER;
		    PreparedStatement preparedStatement=connection.prepareStatement(sql);
		    preparedStatement.setInt(1, customer.getCustomer_id());
		    preparedStatement.setString(2, customer.getFirstname());
		    preparedStatement.setString(3, customer.getLastname());
		    preparedStatement.setString(4, customer.getUsername());
		    preparedStatement.setString(5, customer.getPassword());
		    preparedStatement.setString(6, customer.getEmail());
		    
		    
		    
		    c=preparedStatement.executeUpdate();
		    
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //testing only remove for production
			throw new BusinessException("Internal error occured...please contact SYSADMIN");
		}		
		return c;
	}

	
	
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomerByID(int customer_id) throws BusinessException {
		Customer customer = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = CustomerQueries.GETCUSTOMERBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				customer = new Customer(customer_id, resultSet.getString("firstname"), resultSet.getString("lastname"),
						resultSet.getString("username"), resultSet.getString("password"), resultSet.getString("email"));
			}else {
				throw new BusinessException("Invalid ID!!!... No matching records found for the ID = "+customer_id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. please contact SYSADMIN");
		}
		return customer;
	}


	@Override
	public Customer getCustomerByUsername(String username) throws BusinessException {
		Customer customer = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = CustomerQueries.GETCUSTOMERBYUSERNAME;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				customer = new Customer(resultSet.getInt("customer_id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
						username, resultSet.getString("password"), resultSet.getString("email"));
			}else {
				throw new BusinessException("Invalid Username or Password!!!... No matching records found for the Username = "+ username);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. please contact SYSADMIN");
		}
		return customer;
	}

}



