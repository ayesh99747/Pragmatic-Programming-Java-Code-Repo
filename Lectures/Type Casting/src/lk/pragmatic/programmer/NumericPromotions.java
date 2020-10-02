package lk.pragmatic.programmer;

public class NumericPromotions {
    public static void main(String[] args) {
        byte op1 = 4;
        byte op2 = 5;
        // Both operands were promoted to int and the result must be downcast to byte again.
        byte myResultingByte = (byte) (op1 + op2);
    }
}
