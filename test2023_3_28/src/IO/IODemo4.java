package IO;

import java.io.File;
import java.util.Arrays;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:54
 **/
public class IODemo4 {
    public static void main (String[] args) {
        File file = new File("d:/");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
