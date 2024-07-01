/* Q6. Assume that a bank maintains two kinds of accounts for customers, one called as savings account and
the other current account. The saving account provides compound interest and withdrawal facilities but not
cheque book facility. The current account provides cheque book facility but no interest. current account
holders should also maintains a minimum balance and if the balance falls below this level a service charge is
imposed. Create a class account that stores customerName, accountnNumber and opening balance. from
this derive the classes current and saving to make them more specific to their requirements. Include
necessary member function in order to achieve following tasks:

i) Deposit an amount for a customer and update the balance . 
ii) Display the account details. 
iii)Compute and deposit interest.
Iv) Withdraw amount for a customer after checking the balance and update the balance.
v) Check for the minimum balance(for current account) */

import java.util.Scanner;

class Account {
    protected String customerName;
    protected long accountNumber;
    protected double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }

    public void computeAndDepositInterest() {}
    public void withdraw(double amount) {}
    public void checkAndImposePenalty() {}
}

class SavingsAccount extends Account {
    private double interestRate = 0.04;
    @Override
    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest deposited successfully.");
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class CurrentAccount extends Account {
    private double minimumBalance = 1000.0;
    private double penaltyAmount = 100.0;

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
            checkAndImposePenalty();
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    @Override
    public void checkAndImposePenalty() {
        if (balance < minimumBalance) {
            balance -= penaltyAmount;
            System.out.println("Penalty imposed due to insufficient balance.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.customerName = "Alice";
        savingsAccount.accountNumber = 123456789;
        savingsAccount.balance = 5000.0;

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.customerName = "Bob";
        currentAccount.accountNumber = 987654321;
        currentAccount.balance = 2000.0;
        System.out.println("Savings Account:");
        savingsAccount.displayAccountDetails();
        System.out.println();
        System.out.println("Current Account:");
        currentAccount.displayAccountDetails();
        System.out.println();

        savingsAccount.deposit(1000);
        currentAccount.deposit(500);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.withdraw(2000);
        currentAccount.withdraw(1500);
        currentAccount.checkAndImposePenalty();
        System.out.println();

        System.out.println("Savings Account after transactions:");
        savingsAccount.displayAccountDetails();
        System.out.println();
        System.out.println("Current Account after transactions:");
        currentAccount.displayAccountDetails();
    }
}