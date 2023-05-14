package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-10 23:26
 **/
//发邮件
public class Demo3 {
    // write your code here
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long[] table = new long[22];
        table[1] = 0;
        table[2] = 1;
        for(int i = 3; i < 22; i++){
            table[i] = (i - 1) * (table[i - 1] + table[i - 2]);
        }
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(table[n]);
        }
    }
}
