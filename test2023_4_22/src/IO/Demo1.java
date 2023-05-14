package IO;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:16
 **/
public class Demo1 {
    public static void main (String[] args) throws IOException {
        File f = new File("./hello.txt");
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getCanonicalFile());
    }
}
