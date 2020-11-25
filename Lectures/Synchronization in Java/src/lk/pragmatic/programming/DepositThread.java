package lk.pragmatic.programming;

public class DepositThread implements Runnable {
    private final Account account;
    private final double amount;

    public DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        //make a deposit
        account.deposit(amount);
    }

}
