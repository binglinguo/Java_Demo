package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 00:01
 **/
public class IODemo7 {
    public static void main (String[] args) {
        try(Reader reader = new FileReader("d:/hello.txt")){
            while (true) {
                int b = reader.read();
                if(b == -1){
                    break;
                }
                System.out.println((char)b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
