package IO;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:46
 **/
public class IODemo1 {
    public static void main (String[] args) throws IOException {
        File f = new File("./hello.txt");
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getCanonicalFile());

    }
}
