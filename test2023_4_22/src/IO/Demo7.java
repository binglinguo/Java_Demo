package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:30
 **/
public class Demo7 {
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的路径(绝对路径或相对路径都可以)");
        File file = new File(scanner.next());
        System.out.println("请输入要索引的内容");
        String str = scanner.next();
        if(!file.isDirectory()){//如果当前索引的不是一个目录 则直接返回
            System.out.println("您输入的路径不是一个目录!");
            return ;
        }
        //使用一个函数递归去查找
        isFiles(file,str);

    }

    private static void isFiles (File file , String str) throws IOException {
        if(file ==  null){
            return ;
        }
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){//如果当前是一个普通文件 则打开进行访问
                //查找是否存在
                if(isContentContains(f,str)){
                    System.out.println(f.getCanonicalFile() + "存在索引的内容");
                }
            }else if(f.isDirectory()){//如果当前是一个目录 则进入递归
                //递归
                isFiles(f,str);
            }else {
                continue;
            }
        }
    }

    private static boolean isContentContains (File f , String str) {
        if(f == null){
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        try(InputStream inputStream = new FileInputStream(f)) {
            while(true){
                int b = inputStream.read();
                if(b == -1){
                    break;
                }
                stringBuilder.append((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString().contains(str);
    }
}
