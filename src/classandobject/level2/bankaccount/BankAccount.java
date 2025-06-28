package classandobject.level2.bankaccount;

public class BankAccount {
    // Attributes of the BankAccount class
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money (with balance check)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Display current balance
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}