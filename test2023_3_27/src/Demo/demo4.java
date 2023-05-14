package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 21:03
 **/
//机器人移动到星星
public class demo4 {
    public int uniquePaths(int m, int n) {
        //1.定义状态
        //2.定义状态转移方程 dp[i][j] = dp[i - 1][j] + dp[i][j -1];
        //3.初始化
        //4.返回值
        int[][] dp = new int[m][n];
        //初始化
        for(int i = 0;i < m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0;j < n;j++){
            dp[0][j] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
