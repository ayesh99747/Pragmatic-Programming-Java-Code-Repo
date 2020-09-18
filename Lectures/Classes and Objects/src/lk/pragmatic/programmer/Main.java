package lk.pragmatic.programmer;

public class Main {

    public static void main(String[] args) {
        Object object = new Object();

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1 = account2;
    }
}
