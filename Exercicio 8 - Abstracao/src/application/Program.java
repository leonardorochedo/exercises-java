package application;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Payer> list = new ArrayList<>(); // lista da superclasse abstrata
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine(); // reset
			String name = sc.nextLine();
			System.out.print("Anual incomes: ");
			Double anualIncomes = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPayer(name, anualIncomes, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				list.add(new CompanyPayer(name, anualIncomes, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0;
		for(Payer payer : list) {
			System.out.print(payer.getName() + ": $" + String.format("%.2f", payer.calcTaxes()) + "\n");
			totalTaxes += payer.calcTaxes();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
