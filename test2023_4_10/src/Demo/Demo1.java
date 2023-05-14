package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-10 21:16
 **/
//字符串反转
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder strB = new StringBuilder(str);
        int start = 0;
        int end = strB.length() - 1;
        while(start < end){
            char ch = strB.charAt(start);
            strB.setCharAt(start,strB.charAt(end));
            strB.setCharAt(end,ch);
            start++;
            end--;
        }
        System.out.println(strB.toString());
    }
}
