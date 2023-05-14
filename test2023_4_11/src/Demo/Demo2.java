package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-11 23:31
 **/
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int[] table = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = i + 1;
        }
        int index = 0;
        int r = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U') {
                index = (index + n - 1) % n;
            } else {
                index = (index + n + 1) % n;
            }
        }
        if (index >= 0 && index <= 3 || index >= n - 4 && index <= n  - 1) {
            r = (index / 4) * 4 ;
        } else {
            r = index - 4 + 1;
        }
        for (int i = r; i < r + 4; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println(index);
        System.out.println(table[index]);
    }
}
