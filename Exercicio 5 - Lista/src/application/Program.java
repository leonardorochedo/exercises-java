package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listOfEmployees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			sc.nextLine();
			System.out.println();
			
			System.out.println("Employee #" + (i+1));
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			listOfEmployees.add(new Employee(id, name, salary)); // adicionando eles na lista
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		Integer id = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the percentage: ");
		Double percentage = sc.nextDouble();
		
		Integer indexOfEmp = getIndexOfEmployee(listOfEmployees, id);
		
		// se achou ou nao
		if(indexOfEmp == null) {
			System.out.println();
			System.out.println("This ID does not exist!");
		} else {
			listOfEmployees.get(indexOfEmp).increaseSalary(percentage);	 // pegando o employee, e aplicando o metodo de incrementaar salary		
		}
		
		
		System.out.println();
		System.out.println("List of employees: ");
		
		// listando os empregados
		for(Employee emp: listOfEmployees) {
			System.out.println(emp);
		}

	}
	
	public static Integer getIndexOfEmployee(List<Employee> listOfEmployees, Integer id) { // funcao para achar o index
		for(int i=0; i<listOfEmployees.size(); i++) {
			if(listOfEmployees.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
