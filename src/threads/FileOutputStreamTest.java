package threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest {
    public static void main(String args[]) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("data/test.txt", true); //Если его значение true, данные будут дозаписаны в конец файла. Если false (а по умолчанию это значение и есть false), старые данные будут стерты, а новые записаны
        String greetings = "Some text to greet you\r\n";
        fileOutputStream.write(greetings.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
