package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gloss Salary: ");
		emp.glossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		emp.netSalary();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated Data: " + emp);
		System.out.println();
		
		sc.close();
	}

}
