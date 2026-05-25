package telsuko;

public class BankAccount {

	private  double accountNumber;
	private String accountHolder;
	private double balance;
	double amount=0;
	
	public BankAccount(double accountNumber, String accountHolder, double initalbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if(initalbalance>=0) {
			this.balance=initalbalance;
		}
		else {
			this.balance=0.0;
			System.out.println(" BALANCE CANNOT BE LESS THAN ZER0 ");
		}
	}


	public double getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>=0) {
			balance+=amount;
			System.out.println("Successfully deposit");
		}
		else {
			System.out.println("enter the amount to withdraw");
		}
		
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficient funds");
		} else if (amount <= 0) {
			System.out.println("Provide proper amount");
		} else {
			balance -= amount;
			System.out.println("Amount withdrwan ");
		}
	}
	
	
	
	
}
