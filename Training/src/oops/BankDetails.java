package oops;

public class BankDetails {
	public static void main(String[] args) {
	       BankAccount account = new BankAccount("Harini", 1000);
	       account.deposit(500);
	       account.withdraw(300);
	       account.displayDetails();
	   }
}
