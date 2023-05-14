package File;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 15:35
 **/
//字符流读
public class demo3 {
    public static void main (String[] args) {
        try(Reader read = new FileReader("d:/test.txt")){
            while(true){
                char[] buffer = new char[1024];
                int len = read.read(buffer);
                if(len == -1){
                    break;
                }
//                for (int i = 0 ; i < len ; i++) {
//                    System.out.println(buffer[i]);
//                }
                String s = new String(buffer,0,len);
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
