package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 00:39
 **/
//编辑距离
public class Demo1 {
    public int minDistance (String word1, String word2) {
        // write code here
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        //初始化
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
        //状态转移方程 dp[i][j] = Math.min(dp[i - 1][j] + 1,dp[i - 1][j] + 1,dp[i - 1][j - 1] + 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = Math.min(dp[i - 1][j - 1],dp[i][j]);
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1,dp[i][j]);
                }
            }
        }
        return dp[n][m];
    }
}
