package IO;

import java.io.File;
import java.util.Arrays;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:21
 **/
public class Demo4 {
    public static void main (String[] args) {
        File file = new File("d:/");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
