package com.app.ironbank.main;

import java.util.Scanner;

public class IronBankAppMain {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Welcome to the Iron Bank, always glad to be of service.");
	System.out.println("*******************************************************");
	int choice=0;
	do {
		System.out.println("Iron Bank Menu");
		System.out.println("***************");
		System.out.println("First - Seak Employee by ID");
		System.out.println("Second - Seak Employee by Name");
		System.out.println("Third - Seak for Employee by Username");
		System.out.println("Fourth - Seak Employee by Email");
		System.out.println("Fifth - See all Employees");
		System.out.println("Sixth - Exit");
		System.out.println("Please chose your path (1-6)");
		try{
		choice=Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {

		}
		switch (choice){
			case 1:System.out.println("Our deepest appologies, but this options is under construction.");


			break;
			case 2:System.out.println("Our deepest appologies, but this options is under construction.");

			break;
			case 3:System.out.println("Our deepest appologies, but this options is under construction.");

			break;
			case 4:System.out.println("Our deepest appologies, but this options is under construction.");

			break;
			case 5:System.out.println("Our deepest appologies, but this options is under construction.");

			break;
			case 6:System.out.println("Thank you for visting the Iron Bank.");

			break;
		default:System.out.println("Invalid choice, please choose beteween 1-6. Chose again.");
			break;
		}


		
	}while(choice != 6);

    
    }
 
}
		
		
		
		
//		Employee employee=new Employee(6, "Tycho", "Nestoris", "EnvoyStannis", "faceDeathFull", "tycho@ironbank.brv");
		
//		EmployeeDAO employeeDAO=new EmployeeDaoImpl();
		
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
		
//		try {
//			int employee_id=101; 
//			Employee employee=employeeDAO.getEmployeeByID(103);
//			if(employee != null) {
//				System.out.println("Employee found with id " + employee_id + " info below:");
//				System.out.println(employee);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//	}
	

