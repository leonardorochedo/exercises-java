package model.services;

public interface OnlinePaymentService {
	double paymentFee(double amount); // tax
	
	double interest(double amount, int months); // juros
}
