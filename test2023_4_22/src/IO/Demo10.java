package IO;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:44
 **/
public class Demo10 {
    public static void main (String[] args) {
        try(InputStream inputStream = new FileInputStream("D://shuai.txt");
            OutputStream outputStream = new FileOutputStream("D://hello.txt")) {
            byte[] bytes = new byte[1024];
            inputStream.read(bytes);
            outputStream.write(bytes);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
