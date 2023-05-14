package IO;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:41
 **/
public class Demo9 {
    public static void main (String[] args) {
        try(OutputStream outputStream = new FileOutputStream("D://hello.txt")) {
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            //此处将printWriter设置为了自动刷新 就不需要最后的刷新了
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            printWriter.println(str);
            //printWriter.flush();
            System.out.println("写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
