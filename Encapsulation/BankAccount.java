package Encapsulation;


public class BankAccount {
//	Write a class BankAccount with a private variable balance . Add a method to deposit 
//	an amount and a method to withdraw an amount. Include appropriate getters and setters.

	private double balance;
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("Insufficient balance");		}
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
}
