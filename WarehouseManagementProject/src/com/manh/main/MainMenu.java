package com.manh.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("**********************************************");
		System.out.println("            Welcome to Warehouse Management");
		System.out.println("**********************************************");


		int exit=0;
		do{
		try
		{
			System.out.println("**********************************************");

			System.out.println("Enter type of access needed");
			System.out.println("Type 1 for Administrator access");
			System.out.println("Type 2 for User access");
			System.out.println("Type 3 for Exit");
			System.out.println("**********************************************");

			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
					AdminMenu.adminInputMenu();
					break;
			case 2:
					UserMenu.userInputMenu();
					break;
			case 3:
				System.out.println("**********************************************");
				exit=1;
				System.out.println("\nAre you sure you want to exit the App?\n");
				System.out.println("Type Y for yes");
				System.out.println("Type N for no ");
				
				while(true){
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
							System.out.println("Invalid input.Please enter y/n corresponding to service needed\n");
						}
					} catch (java.util.InputMismatchException excep) {
						System.out.println("Invalid input.Please enter a valid request");
						MainMenu.main(null);
					}
				} 
				
			default:
				System.out.println("Invalid input.Please enter a valid number corresponding to access needed");
				
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input.Please enter a valid number corresponding to access needed");
			MainMenu.main(null);
		}
	}while(exit!=1);
		

	}

}
