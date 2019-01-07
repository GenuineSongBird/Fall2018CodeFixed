package NewVariables;

public class SavingsAccount {
	
	private double balance; //instance variable
	private static double interestRate = 0; //static variable 
	private static int numberOfAccounts = 0; //static variable
	public SavingsAccount() {
		this.balance = 0;
		numberOfAccounts++;
		
	}
	public static double getInterestRate() { //must include static
		return interestRate;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public double getBalance() {
		return this.balance;
	}
	public static void setInterestRate(double interest) {
		if(interest > 0) {
			interestRate = interest;
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0 ) {
			this.balance +=  amount; //equals this.balance + amount
		}
	}
	
	public double withdraw(double amount) {
		if( this.balance >= amount) {
			this.balance = this.balance - amount; //equals this.balance - amount
		}
		else {
			amount = 0;
		}
		
		return amount;
	}
	
	public void addInterest() {
		this.balance =+ this.balance * interestRate; //adds interest to balance
	}
	
	public static void showBalance(SavingsAccount sv) { //call a non-static method inside a static method, create an object to access the nonstatic method
		System.out.print(sv.getBalance());
	}
	
	
	
	
	
}
