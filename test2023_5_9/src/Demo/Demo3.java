package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-09 22:53
 **/
//字符串计数
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String s1 = scanner.next();
            String s2 = scanner.next();
            int len1 = scanner.nextInt();
            int len2 = scanner.nextInt();
            for(int i = s1.length();i < len2; i++){
                s1 += 'a';
            }
            for(int i = s2.length();i < len2; i++){
                s2 += 'z' + 1;
            }
            int[] arr = new int[len2];
            for(int i = 0;i < len2; i++){
                arr[i] = s2.charAt(i) - s1.charAt(i);
            }
            int num = 0;
            for(int i = len1;i <= len2; i++){
                for(int j = 0;j < i; j++){
                    num += arr[j] * Math.pow(26,i - 1 - j);
                }
            }
            System.out.println((num - 1) % 1000007);
        }
        // scanner.close();
    }

}
