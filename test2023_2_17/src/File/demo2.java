package File;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 15:07
 **/
public class demo2 {
    public static void main (String[] args) {
        try ( FileOutputStream outputStream = new FileOutputStream("d:/test.txt");){
//            outputStream.write('g');
//            outputStream.write('b');
//            outputStream.write('l');
            byte[] buffer = new byte[]{'b','l'};
            outputStream.write(buffer);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
