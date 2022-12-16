package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), formater);
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int installment = sc.nextInt();
		
		Contract contract = new Contract(number, date, value); // generate contract
		ContractService contractService = new ContractService(); // service of contract
		
		System.out.println();
		
		System.out.println("Parcelas:");
		contractService.processContract(contract, installment);
		
		sc.close();
	}

}
