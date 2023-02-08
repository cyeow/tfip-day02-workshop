package bank;

public class FixedDepositAccount extends BankAccount {
    
    // members
    private final double interest;
    private final int duration; // in months
    
    // constructors 
    public FixedDepositAccount(String name, double accountBalance) {
        this(name, accountBalance, 3.0);
    }

    public FixedDepositAccount(String name, double accountBalance, double interest) {
        this(name, accountBalance, interest, 6);
    }

    public FixedDepositAccount(String name, double accountBalance, double interest, int duration) {
        super(name,accountBalance);
        this.interest = interest;
        this.duration = duration;
    }

    // getters/setters
    // no setters because these should not be changed after instantiation
    public double getInterest() {
        return interest;
    }

    public int duration() {
        return duration;
    }

    public double getBalance() {
        return getAccountBalance() + (interest/100.0)*getAccountBalance();
    }

    // methods
    // override is used as deposit and withdraw exist in the parent class
    // and the expected behaviour for these methods are different in FixedDepositAccount
    @Override
    public void deposit(double amt) {
        System.out.println("This is a fixed deposit account, deposits are not allowed.");    
    }

    @Override
    public void withdraw(double amt) {
        System.out.println("This is a fixed deposit account, withdrawals are not allowed.");
    }




}
