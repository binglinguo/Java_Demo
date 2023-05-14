package Demo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-12 22:48
 **/
//找出字符串中第一次只出现一次的字符
public class Demo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0) + 1);
        }
        for(int i = 0;i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                return ;
            }
        }
        System.out.println(-1);
    }
}
