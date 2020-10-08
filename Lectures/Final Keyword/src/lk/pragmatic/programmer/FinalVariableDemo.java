package lk.pragmatic.programmer;

public class FinalVariableDemo {
    static{
        PI_2 = 3.141592653589793;
    }

    final int speedlimit=90;//final variable

    // a final variable
    final int THRESHOLD = 5;
    // a blank final variable
     final int THRESHOLD_2;
    // a final static variable PI
    static final double PI = 3.141592653589793;
    // a  blank final static  variable
     static final double PI_2;

    public FinalVariableDemo(int threshold_2) {
        THRESHOLD_2 = threshold_2;
    }
}
