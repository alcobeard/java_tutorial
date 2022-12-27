package threads;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class SpeedTest {
    public static void main(String[] args) throws IOException {
        Date start = new Date();
        FileInputStream fileInputStream = new FileInputStream("data/bible.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        int i;

        while ((i = bufferedInputStream.read()) != -1) {

        }
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
        bufferedInputStream.close();
        fileInputStream.close();

        Date startTwo = new Date();
        fileInputStream = new FileInputStream("data/bible.txt");
        int j;

        while ((j = fileInputStream.read()) != -1) {
        }
        Date endTwo = new Date();

        System.out.println(endTwo.getTime() - startTwo.getTime());
        fileInputStream.close();
    }
}
