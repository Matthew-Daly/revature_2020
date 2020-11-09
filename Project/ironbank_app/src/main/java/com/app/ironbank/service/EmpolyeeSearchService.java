package com.app.ironbank.service;

import java.util.List;

import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Employee;


public interface EmpolyeeSearchService {
	
	public Employee getPlayerByID(int id)throws BusinessException;
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeeByName(String lastname)throws BusinessException;
	public List<Employee> getEmployeeByUsername(String username)throws BusinessException;
	public Employee getEMployeeByEmail(String email)throws BusinessException;
	
		
}
