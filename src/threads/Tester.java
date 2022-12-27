package threads;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(bufferedReader.readLine());
        System.out.println("You entered: " + i);

        Scanner sc = new Scanner(System.in);
        Integer j = sc.nextInt();
        System.out.println("You entered: " + j);
    }
}
