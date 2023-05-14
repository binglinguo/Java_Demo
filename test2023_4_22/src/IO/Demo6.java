package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:25
 **/
public class Demo6 {
    public static void main (String[] args) {
        try(InputStream inputStream = new FileInputStream("d://hello.txt")){
            while(true){
                int b = inputStream.read();
                if(b == -1){
                    break;
                }
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
