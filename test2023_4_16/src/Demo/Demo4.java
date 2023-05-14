package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-16 22:13
 **/
//数根 好恶心 要使用字符串来处理 多注意

public class Demo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            if(str.length() == 0){
                System.out.println(0);
            }
            while(str.length() > 1){
                int value = 0;
                for(int i = 0;i < str.length(); i++){
                    value += str.charAt(i) - '0';
                }
                str = String.valueOf(value);
            }
            System.out.println(str);
        }
    }
}
