package lk.pragmatic.programmer;

import java.io.*;

public class FileInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            OutputStream fout = new FileOutputStream(file);
            
            fout.write(65);
            fout.close();

            FileInputStream is = new FileInputStream(file);
            int size = is.available();
            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
