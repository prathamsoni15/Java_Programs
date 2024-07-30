package Bank;

public class Main {

	public static void main(String[] args) {

        BankAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(200);
        savingAccount.withdraw(150);

        BankAccount currentAccount = new CurrentAccount(500);
        currentAccount.deposit(300);
        currentAccount.withdraw(700);
        currentAccount.withdraw(200);
		
	}

}
