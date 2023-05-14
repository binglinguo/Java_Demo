package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:56
 **/
//读文件
public class IODemo5 {
    public static void main (String[] args) {
        try (InputStream inputStream = new FileInputStream("d:/hello.txt")){
            while(true){
                int b = inputStream.read();
                if(b == -1){
                    break;
                }
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
