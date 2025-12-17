package Class_and_Object;

public class BankAccount {
	
//	4. Create a class BankAccount with variables accountNumber, holderName, and balance. Add
//	methods deposit(double amount) and withdraw(double amount). Create an object and demonstrate
//	deposit and withdrawal operations in main().
	
	int accountNumber;
	String holderName;
	double balance;
	
	void deposit(double amount) {
		balance+=amount;
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public static void main(String args[]) {
		BankAccount detail = new BankAccount();
		
		detail.accountNumber=12345;
		detail.holderName="Mahesh";
		detail.balance=5000;
		detail.deposit(100);
		detail.withdraw(500);
		System.out.println(detail.balance);
		
	}
	
	
}
