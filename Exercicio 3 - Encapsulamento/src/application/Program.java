package application;

import java.util.Locale;
import java.util.Scanner;

import util.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double value = 0;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String menu = sc.next();
		
		if(menu.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
		}
		
		BankAccount account = new BankAccount(accountNumber, holder, value);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.depositValue(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		account.withdrawValue(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(account);
		System.out.println();
		
		sc.close();
	}
}
