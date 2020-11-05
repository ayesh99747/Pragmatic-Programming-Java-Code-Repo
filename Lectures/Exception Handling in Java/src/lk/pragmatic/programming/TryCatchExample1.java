package lk.pragmatic.programming;

public class TryCatchExample1 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //This statement will throw exception
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
        System.out.println("rest of the code");
    }
}
