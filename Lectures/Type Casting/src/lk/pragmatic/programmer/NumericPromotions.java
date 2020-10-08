package lk.pragmatic.programmer;

public class NumericPromotions {
    public static void main(String[] args) {
        byte op1 = 4;
        byte op2 = 5;

        // byte resultingByte = op1 + op2;
        // Both operands were promoted to int and the result must be downcast to byte again.
        byte myResultingByte = (byte) (op1 + op2);
        System.out.println(myResultingByte);
    }
}
