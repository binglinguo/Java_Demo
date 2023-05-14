package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-20 20:54
 **/
//猴子分桃子
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 0){
            long count = (long)(Math.pow(5,n) - 4);
            long sum = (long)(Math.pow(4,n) + n - 4);
            System.out.println(count +" " + sum);
            n = scanner.nextInt();
        }
    }
}
