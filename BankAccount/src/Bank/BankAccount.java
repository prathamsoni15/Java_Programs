package Bank;

public abstract class BankAccount {

	int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
	
}
