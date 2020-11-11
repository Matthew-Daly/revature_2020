package com.app.ironbank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.ironbank.dao.EmployeeDao;
import com.app.ironbank.dbutil.PostresSqlConnection;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int createEmployee(Employee employee)throws BusinessException{
		int c=0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql=EmployeeQueries.INSERTEMPLOYEE;
		    PreparedStatement preparedStatement=connection.prepareStatement(sql);
		    preparedStatement.setString(1, employee.getFirstname());
		    preparedStatement.setString(2, employee.getLastname());
		    preparedStatement.setString(3, employee.getUsername());
		    preparedStatement.setString(4, employee.getPassword());
		    preparedStatement.setString(5, employee.getEmail());
		    
		    
		    
		    c=preparedStatement.executeUpdate();
		    
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //testing only remove for production
			throw new BusinessException("Internal error occured...please contact SYSADMIN");
		}		
		return c;
	}

	
	@Override
    public int updateEmployeeEmail(int employee_id, String newEmail)throws BusinessException{
		int c=0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql="UPDATE theironbank.ironbank.employees SET email=? WHERE employee_id= ?";
		    PreparedStatement preparedStatement=connection.prepareStatement(sql);
		    preparedStatement.setInt(2, employee_id);
		    preparedStatement.setString(1, newEmail);
		    	    
		    c=preparedStatement.executeUpdate();
		    
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //testing only remove for production
			throw new BusinessException("Internal error occured...please contact SYSADMIN");
		}		
		return c;
	}

	

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeByID(int employee_id) throws BusinessException {
		Employee employee = null;
		try (Connection connection = PostresSqlConnection.getConnection()) {
			String sql = EmployeeQueries.GETEMPLOYEEBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, employee_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				employee = new Employee(employee_id, resultSet.getString("firstname"), resultSet.getString("lastname"),
						resultSet.getString("username"), resultSet.getString("password"), resultSet.getString("email"));
			}else {
				throw new BusinessException("Invalid ID!!!... No matching records found for the ID = "+employee_id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // take off this line when in production
			throw new BusinessException("Internal error occured.. please contact SYSADMIN");
		}
		return employee;
	}

}
