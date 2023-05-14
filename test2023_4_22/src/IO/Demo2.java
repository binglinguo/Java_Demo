package IO;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:18
 **/
public class Demo2 {
    public static void main (String[] args) throws IOException {
        File file = new File("./baga.txt");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());//是否存在
        if(!file.exists()){//如果不存在我们创建一个新的baga文本
            file.createNewFile();
        }
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());//是否存在
    }
}
