package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 11:39
 **/
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] table = new int[8];
        // 2 1 7 4 5 3 8 6

        for(int i = 0;i < 8;i++) {
            table[i] = scanner.nextInt();
        }
        int n = table[0];
        for(int i = 0; i < 8; i+=2) {
            n = Math.max(n, table[i]);
        }
        int m = table[1];
        for(int i = 1;i < 8; i+=2) {
            m = Math.max(m, table[i]);
        }
        int count = 0;
        int[][] array = new int[n + 1][m + 1];
        for(int i = table[0]; i < table[2];i++) {
            for(int j = table[1];j < table[3];j++ ) {
                array[i][j] = 1;
                count++;
            }
        }
        for(int i = table[4]; i < table[6];i++) {
            for(int j = table[5];j < table[7];j++ ) {
                if(array[i][j] == 1) {
                    continue;
                }
                array[i][j] = 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
