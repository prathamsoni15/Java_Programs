package Bank;

public class CurrentAccount extends BankAccount {

	 private static final double OVERDRAFT_LIMIT = 1000.0;

	    public CurrentAccount(int balance) {
	        super(balance);
	    }

	    @Override
	    public void deposit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount + ", New balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    @Override
	    public void withdraw(int amount) {
	        if (amount > 0 && (balance - amount >= -OVERDRAFT_LIMIT)) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or overdraft limit exceeded.");
	        }
	    }

	
}
