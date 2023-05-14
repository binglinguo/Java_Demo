package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 22:58
 **/
//走方格的方案数
public class demo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] dp = new int[n + 1][m + 1];
        //初始化
        for(int i = 0; i <= n; i++){
            dp[i][0] = 1;
        }
        for(int j = 0 ; j <= m; j++){
            dp[0][j] = 1;
        }
        //状态转移方程 dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= m; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        System.out.println(dp[n][m]);
    }
}
