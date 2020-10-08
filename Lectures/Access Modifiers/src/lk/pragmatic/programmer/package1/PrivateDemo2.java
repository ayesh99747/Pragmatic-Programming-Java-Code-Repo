package lk.pragmatic.programmer.package1;

class B{
    private B(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class PrivateDemo2{
    public static void main(String args[]){
        // B obj=new B();//Compile Time Error
    }
}

