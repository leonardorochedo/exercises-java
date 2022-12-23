package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.User;
import model.serivces.UserService;

public class Program {

	public static void main(String[] args) {
		// c:\Users\Leonardo\Desktop\in.txt
		
		List<User> list = new ArrayList<>();
		UserService us = new UserService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		File file = new File(path);
		try (Scanner scFile = new Scanner(file)) {
	    	while(scFile.hasNextLine()) {
	    		String[] data = scFile.nextLine().split(",");
	    		String name = data[0];
	    		String email = data[1];
	    		String salary = data[2];
	    		
	    		list.add(new User(name, email, Double.parseDouble(salary)));
	    	}
	    } catch(IOException err) {
	    	System.out.println("Error: " + err.getMessage());
	    }

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		double sum = us.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); // ordenando
		
		System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
		us.filteredEmail(list, p -> p.getSalary() > salary);
		System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

	}

}
