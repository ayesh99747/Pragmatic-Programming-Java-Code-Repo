package lk.pragmatic.programmer;

public class Main {

    public static void main(String[] args) {
        /*
        * Here we create two new objects
        * For this example one balloon is red and the other is blue
        * We can assume that the red balloon points to reference 50
        * and the blue balloon points to reference 100
        * */
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");

        /*
        * We call the swap method and  two new variables o1 and o2 are
        * created pointing to 50 and 100 respectively.
        */
        swap(red, blue);
        System.out.println("Using Swap Method - ");
        System.out.println("red color = " + red.getColor());
        System.out.println("blue color = " + blue.getColor());

        swap2(blue);
        System.out.println("Using swap2 method - ");
        System.out.println("blue color = " + blue.getColor());
    }

    /*
     * We are changing values of o1 and o2 but they are copies of
     * “red” and “blue” reference locations, so actually there is no change in the
     * values of “red” and “blue” and hence the output.
     */
    public static void swap(Object o1, Object o2){ //o1=50, o2=100
        Object temp = o1; //temp=50, o1=50, o2=100
        o1=o2; //temp=50, o1=100, o2=100
        o2=temp; //temp=50, o1=100, o2=50
    }

    /*
    * Here we are passing the value of the reference to the blue balloon.
    * Then we change the color to red.
    * Then we create a new object with the colour green (different reference)
    * Then we change the color of the new object to blue.
    * Hence the output is red.
    * This is because we are printing the reference to the blue object
    * and not the green object.
    * */
    public static void swap2(Balloon balloon) { //baloon=100
        balloon.setColor("Red"); //baloon=100
        balloon = new Balloon("Green"); //baloon=200
        balloon.setColor("Blue"); //baloon = 200
    }




}
