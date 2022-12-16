package model.services;

import java.time.format.DateTimeFormatter;

import model.entities.Contract;

public class ContractService {
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ContractService() {}
	
	public void processContract(Contract contract, Integer months) {
		double valueInitial = contract.getTotalValue() / months;
		
		for(int i=1; i<=months; i++) {
			double interest = new PaypalService().interest(valueInitial, i);
			double tax = new PaypalService().paymentFee(interest + valueInitial);
			
			System.out.println(contract.getDate().plusMonths(i) + " R$" + (valueInitial + interest + tax));
		}
	}
}
