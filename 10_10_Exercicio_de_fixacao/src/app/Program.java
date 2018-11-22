package app;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exception.AccountException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter accont data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		
		System.out.print("Enter amount for Withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (AccountException	 e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
