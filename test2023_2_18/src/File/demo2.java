package File;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-18 10:49
 **/
//将一个文件中的内容复制到另一个文件中
public class demo2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要拷贝的源路径");
        String str = scanner.nextLine();
        System.out.println("请输入要拷贝的路径");
        String desc = scanner.nextLine();
        File strFile = new File(str);
        File descFile = new File(desc);
        if(!strFile.isFile()){
            System.out.println("拷贝的源路径不存在");
            return ;
        }
        try(InputStream inputStream = new FileInputStream(strFile)){
            try(OutputStream outPutSteram = new FileOutputStream(descFile)){
                byte[] buffer = new byte[1024];
                while(true){
                    int len = inputStream.read(buffer);
                    if(len == -1){
                        return ;
                    }
                    outPutSteram.write(buffer,0,len);
                    System.out.println("拷贝成功!");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
