package lk.pragmatic.programming;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        Student p1 = new Student("John", 30, "Male");
        Student p2 = new Student("Rachel", 25, "Female");

        File file = new File("objects.txt");
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            System.out.println("Objects written to file successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

}
