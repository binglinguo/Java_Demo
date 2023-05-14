package File;

import java.io.File;
import java.io.IOException;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-16 15:42
 **/
public class demo1 {
    public static void main (String[] args) throws IOException {
        File f1 = new File("d:/test.txt");
        System.out.println(f1.getParent());//获取到当前的文件的父目录
        System.out.println(f1.getName());//获取到当前文件名
        System.out.println(f1.getPath());//获取到当前文件路径（构造file时指定的路径）
        System.out.println(f1.getAbsoluteFile());//获取到绝对路径
        System.out.println(f1.getCanonicalFile());//获取到绝对路径 简化过的路径
        System.out.println("==========");
        File f2 = new File("./test.txt");
        System.out.println(f2.getParent());//获取到当前的文件的父目录
        System.out.println(f2.getName());//获取到当前文件名
        System.out.println(f2.getPath());//获取到当前文件路径（构造file时指定的路径）
        System.out.println(f2.getAbsoluteFile());//获取到绝对路径
        System.out.println(f2.getCanonicalFile());//获取到绝对路径  简化过的路径
    }
}
