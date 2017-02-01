package com.manh.main;

import java.io.*;
import java.util.*;

import com.manh.account.Account;
import com.manh.bankoperations.AdminOperationsModule;
import com.manh.customer.CommercialCustomer;
import com.manh.customer.PersonalCustomer;

public class AdminMenu {
	public static void adminInputMenu() {
		Scanner scanner = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		int exit = 0;
		System.out.println("Enter type of service needed");

		do {
			try {
				System.out
						.println("**********************************************");
				System.out.println("Type 1 to add an item ");
				System.out.println("Type 2 to search an item ");
				System.out.println("Type 3 to delete an item ");
				System.out.println("Type 4 to edit an item");
				System.out.println("Type 5 to return to main menu ");
				System.out.println("Type 6 to exit ");
				System.out
						.println("**********************************************");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:

					System.out.println("Enter item code");
					int newItemCode = scanner.nextInt();
					System.out.println("Enter item name");
					String newItemName = bufferedReader.readLine();
					System.out.println("Enter unit of the item(ml,mg,pcs)");
					String newItemUnit = bufferedReader.readLine();
					System.out.println("Enter price of the item(Rupees)");
					double newItemPrice = scanner.nextDouble();
					System.out.println("Enter date of maufacture of product");
					String newItemDom = bufferedReader.readLine();
					System.out.println("Enter date of expiry of product");
					String newItemDoe = bufferedReader.readLine();
					System.out.println("Enter category of product");
					System.out
					.println("**********************************************");
					System.out.println("Type 1 for Pharma Drug ");
					System.out.println("Type 2 for Health and personal care ");
					System.out.println("Type 3 for Baby care");
					System.out.println("Type 4 for Medical supplies and equipments ");
					System.out
					.println("**********************************************");
					int customerChoice=scanner.nextInt();
					switch(customerChoice)
					{
					case 1:
						System.out.println("Enter customer name");
						String customerName=scanner.next();
						if(customerName.matches("(^[a-zA-Z0-9]*$)")==false)
						{
							System.out.println("Customer name can have only letters or numbers\n");
							exitChoice=1;
							return;
						}
						System.out.println("Enter customer address ");
						String customerAddress=scanner.next();
						int balance=0;
						
						System.out.println("Enter customer home phone number ");
						int homeNo=scanner.nextInt();
						System.out.println("Enter customer work phone number ");
						int workNo=scanner.nextInt();
						Account account=new Account(balance);
						PersonalCustomer customer=new PersonalCustomer(customerName,customerAddress,account,
								homeNo,workNo);
						AdminOperationsModule admin=new AdminOperationsModule();
						String message=admin.addCustomer(customer);
						System.out.println(message);
						exitChoice=1;
						return;
					case 2:
						System.out.println("Enter customer name");
						String custName=scanner.next();
						if(custName.matches("(^[a-zA-Z0-9]*$)")==false)
						{
							System.out.println("Customer name can have only letters or numbers\n");
							exitChoice=1;

							return;
						}
						System.out.println("Enter customer address ");
						String custAddress=scanner.next();
						int custBalance=0;
						
						System.out.println("Enter contact person phone number ");
						int contactNo=scanner.nextInt();
						System.out.println("Enter contact person name ");
						String contactName=scanner.next();
						Account accounts=new Account(custBalance);
						CommercialCustomer customers=new CommercialCustomer(custName,custAddress,accounts,contactNo,contactName);
						AdminOperationsModule administrator=new AdminOperationsModule();
						String messages=administrator.addCustomer(customers);
						System.out.println(messages);
						exitChoice=1;
						return;
					case 3:
						AdminMenu.adminInputMenu();
						exitChoice=1;
						return;
					default:
						System.out.println("Invalid input.Please enter a valid number corresponding to access needed");
					}
				}
				catch(Exception e)
				{
					System.out.println("Enter valid choice");
					AdminMenu.adminInputMenu();

				}
			}while(exitChoice!=1);
					
					String newItemUnit = bufferedReader.readLine();

				case 2:

					System.out.println("Enter item code");
					int itemCode = scanner.nextInt();
					

					break;
				case 3:
					System.out.println("Enter item code");
					int itemCodes = scanner.nextInt();

					break;
				case 4:
					System.out.println("Enter customer Id");
					int custId = scanner.nextInt();
					CustomerOperationsModule admin = new CustomerOperationsModule();
					System.out.println("Enter customer address");
					String custAddress = scanner.next();
					try {
						String updateCustomer = admin.updateAddress(custId,
								custAddress);
						System.out.println(updateCustomer);
					} catch (CustomerNotFoundException e) {
						System.out.println(e.getMessage());
						CustomerMenu.customerInputMenu();
					}

					// System.out.println(updateCustomer);
					break;

				case 5:
					MainMenu.main(null);
					exit = 1;
					break;
				case 6:
					System.out
							.println("\nAre you sure you want to exit the App?\n");
					System.out.println("Type Y for yes");
					System.out.println("Type N for no ");
					exit = 1;
					while (true) {
						try {
							String exitDecide = scanner.next();
							switch (exitDecide) {
							case "n":
							case "N":
								MainMenu.main(null);
								break;
							case "y":
							case "Y":
								System.out.println("\nTHANK YOU");
								System.exit(0);
								break;
							default:
								System.out
										.println("Invalid input.Please enter y/n corresponding to service needed\n");
							}
						} catch (java.util.InputMismatchException excep) {
							System.out
									.println("Invalid input.Please enter a valid request");
							AdminMenu.adminInputMenu();
						}
					}

				default:
					System.out
							.println("Invalid input.Please enter a valid number corresponding to access needed");

				}
			} catch (InputMismatchException e) {
				System.out
						.println("Invalid input.Please enter a valid number corresponding to access needed");
				AdminMenu.adminInputMenu();
			}

		} while (exit != 1);
	}
}
