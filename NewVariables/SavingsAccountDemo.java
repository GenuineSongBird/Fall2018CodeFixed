package NewVariables;

public class SavingsAccountDemo {

	public static void main(String[] args) {
		//className.staticMethodName();
		SavingsAccount.setInterestRate(0.02);
		
		SavingsAccount sue_acct = new SavingsAccount();
		sue_acct.deposit(80);
		System.out.println("Balance: $" + sue_acct.getBalance());
		sue_acct.withdraw(30);
		System.out.println("Balance after withdrawing $30 is: " + sue_acct.getBalance());

		sue_acct.withdraw(220);
		System.out.println("Balance after withdrawing $220 is: " + sue_acct.getBalance());
		
		SavingsAccount bob_acct = new SavingsAccount();
		bob_acct.deposit(150);
		if(bob_acct.getBalance() > 100) {
			bob_acct.addInterest();
		}
		if(sue_acct.getBalance() > 100) {
			sue_acct.addInterest();
		}
		System.out.println("Bob or Sue may have recieved some interest. Current Balance is: ");
		SavingsAccount.showBalance(bob_acct);
		//SavingsAccount.showBalance(sue_acct);
	}

}
