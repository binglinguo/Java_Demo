package File;

import com.sun.deploy.util.Waiter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 15:48
 **/
public class demo4 {
    public static void main (String[] args) {
        try(Writer writer = new FileWriter("d:/test.txt")){
            writer.write("guobinglinzuishuai");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
