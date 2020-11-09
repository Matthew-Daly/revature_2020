package com.app.ironbank.dao.impl;

public class EmployeeQueries {
	
	public static final String INSERTEMPLOYEE= "INSERT INTO theironbank.ironbank.employees(employee_id, firstname, lastname, username, password, email) VALUES (?, ?, ?, ?, ?, ?)";
	public static final String GETEMPLOYEEBYID= "SELECT firstname, lastname, username, password, email FROM theironbank.ironbank.employees where employee_id=?";
}
