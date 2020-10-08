package lk.pragmatic.programmer.package1;

class A{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}

public class PrivateDemo{
    private int data=40;

    public static void main(String args[]){
        A obj=new A();
        //System.out.println(obj.data);//Compile Time Error
        //obj.msg();//Compile Time Error

        //The following will work
        //PrivateDemo pd = new PrivateDemo();
        //System.out.println(pd.data);
    }
}

