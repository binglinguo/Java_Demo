package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-02 23:20
 **/
public class Demo3 {
    public static int fun(int n){//这个方法要找到n的最大公约数
        int i = n - 1;
        for(;i >= 1; i--){
            if(n % i == 0){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int low = scanner.nextInt();
        int count = 0;
        while(n < low){
            int c = fun(n);
            if(c == 0 || c == 1 || c == n){
                System.out.println(-1);
                return ;
            }
            n += c;
            count++;
        }
        System.out.println(count);

    }
}
