package Bank;

public class SavingAccount extends BankAccount {
	
	   private static final double INTEREST_RATE = 0.04; // 4% interest rate

	    public SavingAccount(int balance) {
	        super(balance);
	    }

	    @Override
	    public void deposit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	            balance += balance * INTEREST_RATE;
	            System.out.println("Deposited: " + amount + ", New balance with interest: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    @Override
	    public void withdraw(int amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

}
