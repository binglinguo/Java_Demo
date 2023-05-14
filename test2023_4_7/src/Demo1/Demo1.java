package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-07 20:19
 **/
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = 1;//小兔子
            int b = 0;//中兔子
            int c = 0;//老兔子
            for(int i = 1;i < n; i++) {
                c += b;
                b = a;
                a = c;
            }
            int sum = a + b + c;
            System.out.println(sum);
        }
    }
}
