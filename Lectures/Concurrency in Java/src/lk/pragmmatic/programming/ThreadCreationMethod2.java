package lk.pragmmatic.programming;

public class ThreadCreationMethod2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running");
    }

    public static void main(String[] args) {
        ThreadCreationMethod2 threadCreationMethod2 = new ThreadCreationMethod2();
        threadCreationMethod2.run();
    }
}
