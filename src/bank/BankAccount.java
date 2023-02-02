package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private double accountBalance;
    private List<String> transactions;
    private boolean hasBeenClosed;
    private long creationDate;
    private long closingDate;

    
    public BankAccount(String name, double accountBalance) {
        this.name = name;
        this.accountNumber = new Random();
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<>();
        this.hasBeenClosed = false;
        this.creationDate = System.currentTimeMillis();
    }

    public BankAccount(String name) {
        this(name,0.0);
    }

    public void deposit(double amt) {
        if(hasBeenClosed) {
            throw new IllegalArgumentException("Account has been closed.");
        } else if(amt < 0) {
            throw new IllegalArgumentException("Negative amount deposited.");
        }

        accountBalance += amt;

        transactions.add("deposit $" + amt + " at <date time>");
    }

    public void withdraw(double amt) {
        if(hasBeenClosed) {
            throw new IllegalArgumentException("Account has been closed.");
        } else if(amt < 0) {
            throw new IllegalArgumentException("Negative amount withdrawn.");
        }

        accountBalance += amt;

        transactions.add("withdraw $" + amt + "at <date time>");
    }
}
