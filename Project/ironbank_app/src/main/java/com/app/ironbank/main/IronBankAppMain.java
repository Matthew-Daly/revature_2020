package com.app.ironbank.main;

import com.app.ironbank.dao.EmployeeDAO;
import com.app.ironbank.dao.impl.EmployeeDaoImpl;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Employee;

public class IronBankAppMain {

	public static void main(String[] args) {
		
//		Employee employee=new Employee(6, "Tycho", "Nestoris", "EnvoyStannis", "faceDeathFull", "tycho@ironbank.brv");
		
		EmployeeDAO employeeDAO=new EmployeeDaoImpl();
		
//		try {
//			if(employeeDAO.createEmployee(employee)>0) {
//				System.out.println("Employee created in DB with the following details:");
//				System.out.println(employee);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			int employee=employeeDAO.updateEmployeeEmail(6, "tycho2@ironbank.brv");
//			if(employeeDAO.updateEmployeeEmail(6, "tycho2@ironbank.brv")>0){
//				System.out.println("Email updated!");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			int employee_id=103; 
			Employee employee=employeeDAO.getEmployeeByID(103);
			if(employee != null) {
				System.out.println("Employee found with id " + employee_id + "info below:");
				System.out.println(employee);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
