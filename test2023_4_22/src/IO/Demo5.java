package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:24
 **/
public class Demo5 {
    public static void main (String[] args) {
        try (InputStream inputStream = new FileInputStream("d:/hello.txt")){
            while(true){
                int b = inputStream.read();
                if(b == -1){
                    break;//当读取到-1的时候就表示到达了文件的结尾
                }
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
