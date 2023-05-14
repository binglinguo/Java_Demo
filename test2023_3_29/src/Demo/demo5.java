package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 23:17
 **/
//背包问题
public class demo5 {
    public int backPackII1(int m, int[] a, int[] v) {
        // write your code here
        int n = a.length;
        int[][] dp = new int[n + 1][m + 1];
        //在Java中会自动的把数组内容全部初始化为0
        for(int i = 1; i <= n; i++){//
            for(int j = 1; j <= m; j++){//背包的空间大小
                if(a[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - a[i - 1]] + v[i - 1]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][m];
    }
    public int backPackII(int m, int[] a, int[] v) {
        // write your code here
        int n = a.length;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(a[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - a[i - 1]] + v[i - 1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][m];
    }
}
