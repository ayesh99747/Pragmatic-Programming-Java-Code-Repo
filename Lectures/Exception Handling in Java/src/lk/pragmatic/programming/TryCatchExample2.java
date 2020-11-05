package lk.pragmatic.programming;

public class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
            System.out.println("rest of the code");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
