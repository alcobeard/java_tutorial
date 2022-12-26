package threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data/input_test.txt");
        int i;
        while((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
