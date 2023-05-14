package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 11:39
 **/
public class demo1 {
//    public static void main (String[] args) throws IOException {
//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("D:/test.txt");
//            while(true){
//                int ret = inputStream.read();
//                if(ret == -1){
//                    break;
//                }
//                System.out.println((char) ret);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            inputStream.close();
//        }
//    }
//    public static void main (String[] args) throws FileNotFoundException {
//        try (FileInputStream inputStream = new FileInputStream("D:/test.txt")){
//            while(true){
//                int b = inputStream.read();
//                if(b == -1){
//                    break;
//                }
//                System.out.print((char) b+"");
//                //System.out.print(" ");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main (String[] args) {
        try (FileInputStream inputStream = new FileInputStream("d:/test.txt")){
            //while(true){
                byte[] buffer = new byte[1024];
                int len = inputStream.read(buffer);
                if(len == -1){
                    return ;
                }
                for (int i = 0 ; i < len ; i++) {
                    System.out.println(buffer[i]);
                }
            //}
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
