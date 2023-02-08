package bank;

public class Main {
    public static void main(String[] args) {
        
        // create an instance of BankAccount and test the methods
        BankAccount acct = new BankAccount("Salmon", 1.00);
        acct.deposit(100.2);
        acct.withdraw(20.0);
        acct.setHasBeenClosed(true);
        try {
            acct.withdraw(10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Account has been closed!");
        }
        // create an instance of FixedDepositAccount and test the methods
        FixedDepositAccount fd = new FixedDepositAccount("Batfish", 10.0, 4.9, 10);
        fd.deposit(99.9);
        fd.withdraw(22.1);
        fd.getBalance();

        // below shows that even though fdfake is BankAccount class, 
        // the .deposit and .withdraw functions will still be overriden
        // because the actual object in fdfake is of FixedDepositAccount class.
        BankAccount fdfake = new FixedDepositAccount("Trout", 1000.0);
        fdfake.deposit(100.0);
        fdfake.withdraw(20.0);
        // the following method will not work as fdfake is of BankAccount class
        //fdfake.getBalance(); 

        // printing out transactions just to confirm the actions above
        System.out.println(acct.getName() + 
                            " (Account No.: " + acct.getAccountNumber() + ")\n" + 
                            acct.getTransactions());
        System.out.println(fd.getName() + 
                            " (Account No.: " + fd.getAccountNumber() + ")\n" + 
                            fd.getTransactions());
        System.out.println(fdfake.getName() + 
                            " (Account No.: " + fdfake.getAccountNumber() + ")\n" + 
                            fdfake.getTransactions());
    }
}
