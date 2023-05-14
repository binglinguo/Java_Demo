package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-18 09:55
 **/
//实现一个文件删除功能
public class demo1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要扫描的路径");
        String rootDirPath = scanner.nextLine();
        System.out.println("请输入你要删除的文件名");
        String toDeleteName = scanner.nextLine();
        File f = new File(rootDirPath);
        if(!f.isDirectory()){
            System.out.println("扫描的路径有误!!!");
            return ;
        }
        scanDir(f,toDeleteName);
    }

    private static void scanDir (File f , String toDeleteName) {
        File[] fs = f.listFiles();
        if(fs == null){
            return ;
        }
        for (File f1 : fs) {
            if(f1.isFile()){
                if(f1.getName().contains(toDeleteName)){
                    deleteFile(f1);
                }
            }else if(f1.isDirectory()){
                scanDir(f1,toDeleteName);
            }
        }
    }

    private static void deleteFile (File f1) {
        try {
            System.out.println("您是否要删除"+ f1.getCanonicalPath()+"(Y/N)");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        String flg = scanner.next();
        if(flg.equals("Y")||flg.equals("y")){
            f1.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("删除取消");
        }
    }
}
