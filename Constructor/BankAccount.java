package Constructor;

public class BankAccount {
//	4. Create a class BankAccount with variables accountNumber, holderName, and balance. Add
//	methods deposit(double amount) and withdraw(double amount). Create an object and 
//	demonstrate deposit and withdrawal operations in main().

	int accountNumber;
	String holderName;
	double balance;

	// Constructor
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}


	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String args[]) {
		BankAccount detail = new BankAccount(1122, "John Doe", 5000.0);
		detail.deposit(100);
		detail.withdraw(500);
		System.out.println("Account Number: " + detail.accountNumber);
		System.out.println("Holder Name: " + detail.holderName);
		System.out.println("Balance: " + detail.balance);
	}
}
