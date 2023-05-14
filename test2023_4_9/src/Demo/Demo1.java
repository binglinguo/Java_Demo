package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-09 22:38
 **/
//汽水瓶
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            if(n == 0){
                return ;
            }
            int ret = 0;
            if(n >= 2){
                ret = n / 2;
            }
            System.out.println(ret);
        }
    }
}
