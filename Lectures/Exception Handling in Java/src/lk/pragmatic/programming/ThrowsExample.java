package lk.pragmatic.programming;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        ThrowsExample obj = new ThrowsExample();
        obj.p();
        System.out.println("normal flow...");
    }

    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
