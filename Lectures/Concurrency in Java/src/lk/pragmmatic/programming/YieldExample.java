package lk.pragmmatic.programming;

// MyThread extending Thread
class MyThread2 extends Thread {
    public void run() {
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()
                    + " in control");
    }
}

public class YieldExample {
    public static void main(String[]args) {
        MyThread2 t = new MyThread2();
        t.start();

        for (int i=0; i<5; i++) {
            // Control passes to child thread
            Thread.yield();

            // After execution of child Thread
            // main thread takes over
            System.out.println(Thread.currentThread().getName()
                    + " in control");
        }
    }
}
