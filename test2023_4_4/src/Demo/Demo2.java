package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-04 22:57
 **/
//计算二进制中1的个数
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int count = 0;
            while(n > 0){
                n = n & (n - 1);
                count++;
            }
            System.out.println(count);
        }
    }
}
