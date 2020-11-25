package lk.pragmmatic.programming;

public class PriorityThreadExample extends Thread {
    public static void main(String[] args) {
        PriorityThreadExample m1 = new PriorityThreadExample();
        PriorityThreadExample m2 = new PriorityThreadExample();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();

    }

    public void run() {
        System.out.println("running thread name is : " + Thread.currentThread().getName());
        System.out.println("running thread priority is : " + Thread.currentThread().getPriority());

    }
}
