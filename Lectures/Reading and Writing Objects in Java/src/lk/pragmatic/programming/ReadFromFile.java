package lk.pragmatic.programming;

import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) {

        File file = new File("objects.txt");
        try {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Student pr1 = (Student) oi.readObject();
            Student pr2 = (Student) oi.readObject();

            System.out.println("Student 1 - ");
            System.out.println(pr1.toString());
            System.out.println("Student 2 - ");
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
