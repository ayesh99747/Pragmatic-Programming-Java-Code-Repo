package lk.pragmatic.programmer;

class Mammal {
    final void run(){System.out.println("running");}
}

class FinalMethodDemo extends Mammal {
    // void run(){System.out.println("Human running safely with 5kmph");}

    public static void main(String args[]){
        FinalMethodDemo human = new FinalMethodDemo();
        human.run();
    }
}