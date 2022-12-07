package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		Integer numberAccount = sc.nextInt();
		System.out.print("Holder: ");
		String holderAccount = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(numberAccount, holderAccount, balance, withdrawLimit);
		
		System.out.println();
		
		try {
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch(IllegalArgumentException err) {
			System.out.println("Withdraw error: " + err.getMessage());
		}
	}

}
