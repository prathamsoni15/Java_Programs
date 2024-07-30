package oops2;

public class BankCustomer {

	private String firstname;
	private String lastname;
	
	BankCustomer (String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}	
}

class BankAccount {
	
	BankCustomer Cust;
	float balance;
	
	BankAccount (BankCustomer Cust, float balance) {
		this.Cust = Cust;
		this.balance = balance;
	}
	
}