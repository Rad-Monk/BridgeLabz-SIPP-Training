package com.inheritance.hierarchicalinheritance.bankaccount;

public class Main {
	public static void main(String[] args) {
		// Creating instances of different account types
		SavingsAccount sa = new SavingsAccount("SA123", 20000.0, 4.5);
		CheckingAccount ca = new CheckingAccount("CA456", 15000.0, 10000.0);
		FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000.0, 12);

		// Displaying account types
		sa.displayAccountType();
		ca.displayAccountType();
		fda.displayAccountType();
	}
}