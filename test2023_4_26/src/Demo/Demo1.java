package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-26 22:51
 **/
//养兔子
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long[] fib = new long[91];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2;i < 91; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(fib[n]);
        }
    }
}
