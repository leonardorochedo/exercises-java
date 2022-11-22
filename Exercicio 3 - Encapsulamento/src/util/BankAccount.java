package util;

public class BankAccount {

	private int accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount() {
	}
	
	public BankAccount(int accountNumber, String holder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}

	public double depositValue(double value) {
		this.balance += value;
		return balance;
	}
	
	public double withdrawValue(double value) {
		this.balance -= (value + 5.00);
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
	}
	
}
