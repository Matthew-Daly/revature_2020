///am consolidating this customer and employee into user man not be used in final app
package com.app.ironbank.dao;

import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Customer;

public interface CustomerDao {


	public int createCustomer(Customer customer)throws BusinessException;
	public void deleteCustomer(int customer_id)throws BusinessException;
	public Customer getCustomerByID(int customer_id)throws BusinessException;
	public Customer getCustomerByUsername(String username)throws BusinessException;
	
}
