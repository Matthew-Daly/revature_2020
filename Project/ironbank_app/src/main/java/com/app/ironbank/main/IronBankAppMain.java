package com.app.ironbank.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.ironbank.dao.AccountDao;
import com.app.ironbank.dao.CustomerDao;
import com.app.ironbank.dao.TransactionDao;
import com.app.ironbank.dao.impl.AccountDaoImpl;
import com.app.ironbank.dao.impl.CustomerDaoImpl;
import com.app.ironbank.dao.impl.TransactionDaoImpl;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Account;
import com.app.ironbank.model.Customer;
import com.app.ironbank.model.Transaction;
import com.app.ironbank.service.LogMain;

public class IronBankAppMain {
	
	// private static Logger log=Logger.getLogger(LogMain.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the IronBank, we are glad to be of service.");
		System.out.println("******************************************************");
		System.out.println("How many we help?");
		int ch = 0;
		do {
			System.out.println("Iron Bamk MENU");
			System.out.println("********************");
			System.out.println("1 Create User Account");
			System.out.println("2 Open An Account");
			System.out.println("3 ");
			System.out.println("4 ");
			System.out.println("5 ");
			System.out.println("6 ");
			System.out.println("7 ");
			System.out.println("8 ");
			System.out.println("Please enter appropriate choice(1-8) :) ");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:
				System.out.println("Please Enter your first name:");
				String firstName = scanner.nextLine();
				System.out.println("Please Enter your last name:");
				String lastName = scanner.nextLine();
				System.out.println("Please Enter a user name:");
				String userName = scanner.nextLine();
				System.out.println("Please Enter a password:");
				String password = scanner.nextLine();
				System.out.println("Please Enter a email address:");
				String email = scanner.nextLine();
			
				Customer customer=new Customer(4, firstName, lastName ,userName, password, email);
			
				CustomerDao customerDao=new CustomerDaoImpl();
		
				try {
					if(customerDao.createCustomer(customer)>0) {
					System.out.println("Customer created in DB with below details");
					System.out.println();
				}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:	
				System.out.println("Please enter your customer id:");
				int customer_id = Integer.parseInt(scanner.nextLine());
				// System.out.println("Please Enter your pasword:");
				// String password2= scanner.nextLine();

				CustomerDao customerDao2=new CustomerDaoImpl();
		
				
				try {
					Customer customerFound=customerDao2.getCustomerByID(customer_id);
					if(customerFound!=null) {
						System.out.println("We Found "+ customerFound);
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}
				

			

				break;
			case 3:
				System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

				break;
			case 4:
				System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

				break;
			case 5:
				System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

				break;
			case 6:
				System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

				break;
			case 7:
				// System.out.println("Fetching All The Players From the DB");
				// try {
				// 	List<Player> playersList=playerSearchService.getAllPlayers();
				// 	if(playersList!=null && playersList.size()>0) {
				// 		System.out.println("We Found "+playersList.size()+" no of player/s in the DB.. Details are");
				// 		for(Player p:playersList) {
				// 			System.out.println(p);
				// 		}
				// 	}
				// } catch (BusinessException e) {
				// 	System.out.println(e.getMessage());
				// }

				break;
			case 8:
				System.out.println("Thank you for using the IronBank. Have a pleasent day - but remmeber we will have our due.");

				break;
			default:
				System.out.println("Invalid Choice!!!! Please enter choice between 1-8 only");
				break;
			}
		} while (ch != 8);

	}

}







