package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 23:35
 **/
//计算某字符出现的次数
public class Demo8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        int count = 0;
        String s = str.toLowerCase();
        if(ch >= 'A' && ch <='Z'){
            ch += 32;
        }
        int[] array = new int[256];
        for(int i = 0;i < s.length(); i++){
            array[s.charAt(i)]++;
        }
        System.out.println(array[ch]);
    }
}
