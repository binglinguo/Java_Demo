package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:59
 **/
//写文件
public class IODemo6 {
    public static void main (String[] args) {
       try (OutputStream outputStream = new FileOutputStream("d:/hello.txt")){
            outputStream.write('a');
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
