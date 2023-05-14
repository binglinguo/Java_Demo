package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-09 22:27
 **/
//最长公共子序列
public class Demo2 {
    // write your code here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            int len1 = s1.length();
            int len2 = s2.length();
            int[][] dp = new int[len1 + 1][len2 + 1];
            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = Math.max(Math.max(dp[i][j - 1],dp[i - 1][j - 1] + 1),dp[i - 1][j]);
                    } else {
                        dp[i][j] = Math.max(Math.max(dp[i][j - 1],dp[i - 1][j - 1]), dp[i - 1][j]);
                    }
                }
            }
            System.out.println(dp[len1][len2]);
        }
        scanner.close();
    }
}
