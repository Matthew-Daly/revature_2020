package com.app.ironbank.dao;

import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Employee;

public interface EmployeeDao {
	
	public int createEmployee(Employee employee)throws BusinessException;
	public int updateEmployeeEmail(int empolyee_id, String newEmail)throws BusinessException;
	public void deleteEmployee(int employee_id)throws BusinessException;
	public Employee getEmployeeByID(int employee_id)throws BusinessException;
	
}
