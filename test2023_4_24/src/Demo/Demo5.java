package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-25 00:16
 **/
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fib = new int[100001];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < 100001; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 100000;
        }
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.print(fib[n - 1]+ " ");
        }
    }
}
