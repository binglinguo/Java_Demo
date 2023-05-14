package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-26 21:32
 **/
//最小步数变化为斐波那契数字
public class demo2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int f1 = 1;
            int f2 = 1;
            while(f2 <= n){
                int f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            int f1n = Math.abs(f1 - n);
            int f2n = Math.abs(f2 - n);
            int ret = f1n < f2n ? f1n : f2n;
            System.out.println(ret);
        }
    }
}
