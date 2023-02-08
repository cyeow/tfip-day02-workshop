package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount {

    // members 
    // final keyword indicates that the member cannot be changed after instantiation
    private final String name;
    private final String accountNumber;
    private double accountBalance;
    private ArrayList<String> transactions;
    private boolean hasBeenClosed;
    private LocalDateTime creationDate;
    private LocalDateTime closingDate;

    // constructors
    public BankAccount(String name, double accountBalance) {
        this.name = name;
        this.accountNumber = "" + new Random().nextInt(99999999, 1000000000); //random 10 digit number
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<>();
        this.hasBeenClosed = false;
        this.creationDate = LocalDateTime.now();
        this.closingDate = null;
        // System.out.println("Created account " + accountNumber + " for " + name + " with balance $" + accountBalance + " at " + creationDate);
    }

    public BankAccount(String name) {
        this(name,0.0);
    }
    
    // getters/setters
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public void setHasBeenClosed(boolean hasBeenClosed) {
        this.hasBeenClosed = hasBeenClosed;
        System.out.println(name + "'s account (" + accountNumber + ") has been closed.");
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public boolean isHasBeenClosed() {
        return hasBeenClosed;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }


    // methods
    public void deposit(double amt) {
        System.out.println("attempting to deposit $" + amt + " into " + accountNumber);

        if(hasBeenClosed) {
            throw new IllegalArgumentException("Account has been closed.");
        } else if(amt < 0) {
            throw new IllegalArgumentException("Attempting to deposit negative amount.");
        }

        accountBalance += amt;

        transactions.add("deposited $" + amt + " at " + LocalDateTime.now());
    }

    public void withdraw(double amt) {
        System.out.println("attempting to withdraw $" + amt + " from " + accountNumber);
        if(hasBeenClosed) {
            throw new IllegalArgumentException("Account has been closed.");
        } else if(amt < 0) {
            throw new IllegalArgumentException("Attempting to withdraw negative amount.");
        }

        accountBalance += amt;

        transactions.add("withdrew $" + amt + " at " + LocalDateTime.now());
    }
}
