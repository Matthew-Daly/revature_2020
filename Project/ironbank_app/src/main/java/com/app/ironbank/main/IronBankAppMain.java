package com.app.ironbank.main;

import java.util.Scanner;

import com.app.ironbank.dao.CustomerDao;
import com.app.ironbank.dao.impl.CustomerDaoImpl;
import com.app.ironbank.exception.BusinessException;
import com.app.ironbank.model.Customer;

public class IronBankAppMain {
	// private static Scanner scanner = new Scanner(System.in);
	// private static String firstName = "";
	// private static String lastName = "";
	// private static String userName = "";
	// private static String password = "	";
	// private static String email = "";
	


	public static void loginReg() { // login or register for account
		System.out.println("Welcome to the IronBank, we are glad to be of service.");
		System.out.println("******************************************************");
		System.out.println("How many we help?");
		System.out.println("\n\n\nPlease select an option: \n"
				+ "1. Create an account \n2. Login");
	}


	public static void createAccount() { 
		System.out.println("What type of account would you like?: \n"
				+ "1. Bank Employee \n"
				+ "2. Bank User");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choiceNum = 0;
		boolean done = false;

		while(done != true){

			int userInput = 0;


			switch (choiceNum) {
			case 0: 
				System.out.println("Welcome to the IronBank, we are glad to be of service.");
				System.out.println("******************************************************");
				System.out.println("How many we help?");
		        System.out.println("\n\n\nPlease select an option: \n"
				+ "1. Create an account \n2. Login");

				choiceNum = Integer.parseInt(scanner.nextLine());
				break;
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

				Customer customer=new Customer(firstName, lastName ,userName, password, email);
				CustomerDao customerDao=new CustomerDaoImpl();
				createAccount();

				try {
					if(customerDao.createCustomer(customer)>0) {
					System.out.println("Customer created in DB with below details");
					System.out.println();
				}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				// choiceNum = Integer.parseInt(scanner.nextLine());

				// break;
			case 2:
				System.out.println("underconstruction2");
				done=true;
				break;
			case 3:
				System.out.println("underconstruction3");
				done=true;
				break;
			case 4:
				System.out.println("underconstruction4");
				done=true;
				break;
			case 5:
				System.out.println("underconstruction5");
				done=true;
				break;
			case 6:
				System.out.println("underconstruction6");
				done=true;
				break;		
			default:
				System.out.println("Default case - something went wrong");
				break;
			}
		}	


		// System.out.println("Welcome to the IronBank, we are glad to be of service.");
		// System.out.println("******************************************************");
		// System.out.println("How many we help?");
		// int ch = 0;
		// do {
		// 	System.out.println("Iron Bamk MENU");
		// 	System.out.println("********************");
		// 	System.out.println("1 Create User Account");
		// 	System.out.println("2 Open An Account");
		// 	System.out.println("3 Make A Deposit");
	// 		System.out.println("4 ");
	// 		System.out.println("5 ");
	// 		System.out.println("6 ");
	// 		System.out.println("7 ");
	// 		System.out.println("8 ");
	// 		System.out.println("Choose Wisely(1-8) :) ");
	// 		try {
	// 			ch = Integer.parseInt(scanner.nextLine());
	// 		} catch (NumberFormatException e) {

	// 		}
	// 		switch (ch) {
	// 		case 1:
	// 			System.out.println("Please Enter your first name:");
	// 			String firstName = scanner.nextLine();
	// 			System.out.println("Please Enter your last name:");
	// 			String lastName = scanner.nextLine();
	// 			System.out.println("Please Enter a user name:");
	// 			String userName = scanner.nextLine();
	// 			System.out.println("Please Enter a password:");
	// 			String password = scanner.nextLine();
	// 			System.out.println("Please Enter a email address:");
	// 			String email = scanner.nextLine();
			
	// 			Customer customer=new Customer(6, firstName, lastName ,userName, password, email);
			
	// 			CustomerDao customerDao=new CustomerDaoImpl();
		
	// 			try {
	// 				if(customerDao.createCustomer(customer)>0) {
	// 				System.out.println("Customer created in DB with below details");
	// 				System.out.println();
	// 			}
	// 			} catch (BusinessException e) {
	// 				System.out.println(e.getMessage());
	// 			}
	// 			break;

	// 		case 2:	
	// 			int initial_deposit=0;
	// 			System.out.println("Please enter your customer id:");
	// 			int customer_id = Integer.parseInt(scanner.nextLine());
	// 			System.out.println("How much would you like as your initial deposit?");
	// 			try {
	// 			initial_deposit = Integer.parseInt(scanner.nextLine());
	// 			System.out.println(initial_deposit);
	// 			} catch (NumberFormatException e) {

	// 			}
				
	// 			CustomerDao customerDao2=new CustomerDaoImpl();
	// 			try {
	// 				Customer customerFound=customerDao2.getCustomerByID(customer_id);
	// 				if(customerFound!=null) {
	// 					System.out.println("We Found "+ customerFound);
	// 					System.out.println(customerFound);

	// 				AccountDao accountDao=new AccountDaoImpl();	
	// 				Account account=new Account(4, initial_deposit, customer_id);

	// 				TransactionDao transactionDao=new TransactionDaoImpl();	
	// 				Transaction transaction=new Transaction(2, "deposit", initial_deposit, customer_id);
	// 				transactionDao.createTransaction(transaction);

	// 				System.out.println(account);
	// 				try {
	// 				if(accountDao.createAccount(account)>0) {
	// 				System.out.println("Customer created in DB with below details");
	// 				System.out.println();
	// 			}
	// 			} catch (BusinessException e) {
	// 				System.out.println(e.getMessage());
	// 			}

	// 				}
	// 			} catch (BusinessException e1) {
	// 				System.out.println(e1.getMessage());
	// 			}

	// 			break;
	// 		case 3:
	// 			int deposit=0;
	// 			System.out.println("Please enter your account number:");
	// 			int customer_id2 = Integer.parseInt(scanner.nextLine());
	// 			System.out.println("How much would you like to deposit?");
	// 			try {
	// 			deposit = Integer.parseInt(scanner.nextLine());
	// 			System.out.println(deposit);
	// 			} catch (NumberFormatException e) {

	// 			}

	// 			AccountDao accountDao=new AccountDaoImpl();	
	// 			Account account=new Account(4, deposit, customer_id2);

	// 			TransactionDao transactionDao=new TransactionDaoImpl();	
	// 			Transaction transaction=new Transaction(3, "deposit", deposit, customer_id2);
	// 			try {
	// 				transactionDao.createTransaction(transaction);
	// 			} catch (BusinessException e) {
	// 				System.out.println(e);
	// 			}

	// 			System.out.println(account);

	// 			break;
	// 		case 4:
	// 			System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

	// 			break;
	// 		case 5:
	// 			System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

	// 			break;
	// 		case 6:
	// 			System.out.println("Thank you for your interest. This option is still under CONSTRUCTION");

	// 			break;
	// 		case 7:
	// 			// System.out.println("Fetching All The Players From the DB");
	// 			// try {
	// 			// 	List<Player> playersList=playerSearchService.getAllPlayers();
	// 			// 	if(playersList!=null && playersList.size()>0) {
	// 			// 		System.out.println("We Found "+playersList.size()+" no of player/s in the DB.. Details are");
	// 			// 		for(Player p:playersList) {
	// 			// 			System.out.println(p);
	// 			// 		}
	// 			// 	}
	// 			// } catch (BusinessException e) {
	// 			// 	System.out.println(e.getMessage());
	// 			// }

	// 			break;
	// 		case 8:
	// 			System.out.println("Thank you for using the IronBank. Have a pleasent day - but remmeber we will have our due.");

	// 			break;
	// 		default:
	// 			System.out.println("Invalid Choice!!!! Please enter choice between 1-8 only");
	// 			break;
	// 		}
	// 	} while (ch != 8);

	 }

}







