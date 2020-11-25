package lk.pragmmatic.programming;

public class ThreadCreationAnonymousImplementationMethod2 {
    public static void main(String[] args) {
        Runnable myRunnable =
                new Runnable() {
                    public void run() {
                        System.out.println("Runnable running");
                    }
                };

        myRunnable.run();
    }
}
