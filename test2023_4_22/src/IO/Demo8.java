package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:38
 **/
public class Demo8 {
    public static void main (String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("D:\\hello.txt");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        outputStream.write(str.getBytes());
        outputStream.flush();
    }
}
