package lk.pragmatic.programmer;

public class BankAccount {
    private double balance;
    private String accountNum;

    // No Argument Constructor
    // Default Constructor
    public BankAccount(){   }

    // Parameterized Constructor
    public BankAccount(double balance, String accountNum) {
        this.balance = balance;
        this.accountNum = accountNum;
    }

    public void withdraw(double amount){    }

    public void deposit(double amount){     }

    public double getBalance() {
        return balance;
    }

    public void close(){}
}
