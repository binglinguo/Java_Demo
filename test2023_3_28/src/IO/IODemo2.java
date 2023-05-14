package IO;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:49
 **/
public class IODemo2 {
    public static void main (String[] args) throws IOException {
        File file = new File("./baga.txt");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());//是否存在
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());//是否存在
    }
}
