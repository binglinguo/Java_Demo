package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 22:51
 **/
//完全数计算
public class Demo9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 2;i <= n; i++){
            //完数是该数字的所有约数之和仍等于这个数 那么这个数就是一个完数
            int num = 0;
            for(int j = 1;j < i; j++){
                if(i % j == 0){
                    num += j;
                }
            }
            if(i == num){
                count++;
            }
        }
        System.out.println(count);
    }
}
