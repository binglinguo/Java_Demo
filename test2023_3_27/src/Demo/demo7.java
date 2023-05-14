package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 22:58
 **/
//最小公倍数
public class demo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int n = A < B ? A : B;
            int t = n;
            while(n % B != 0){
                n += t;
            }
            System.out.println(n);
        }
    }
}
