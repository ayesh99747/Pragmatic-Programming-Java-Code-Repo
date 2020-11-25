package lk.pragmatic.programming;

public class WithdrawThread implements Runnable {
    private final Account account;

    private final double amount;

    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
