package lk.pragmmatic.programming;

public class ThreadCreationMethod1 extends Thread {
    public static void main(String[] args) {
        ThreadCreationMethod1 myThread = new ThreadCreationMethod1();
        myThread.start();
    }

    public void run() {
        System.out.println("MyThread running");
    }
}
