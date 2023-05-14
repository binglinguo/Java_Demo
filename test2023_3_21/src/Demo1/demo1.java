package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-21 22:26
 **/
//取出字符串中最长的数字序列
public class demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            String newStr = null;
            StringBuilder string = new StringBuilder();
            if(str == null || str.length() == 0){
                System.out.println(newStr);
            }
            int n = 0;
            int i = 0;
            while(i < str.length()){
                while(i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                    string.append(str.charAt(i));
                    n++;
                    i++;
                }
                if(newStr == null || newStr.length() < n){
                    newStr = string.toString();
                }
                string.delete(0,string.length());
                n = 0;
                i++;
            }
            System.out.println(newStr);
        }
    }
}
