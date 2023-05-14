package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 14:41
 **/
//不同的子序列
public class Demo2 {
    public int numDistinct (String S, String T) {
        // write code here
        int row = S.length();
        int low = T.length();
        int[][] dp = new int[row + 1][low + 1];
        //初始化
        dp[0][0] = 1;
        for(int i = 1; i <= row; i++){
            dp[i][0] = 1;
            for(int j = 1;j <= low; j++){
                if(S.charAt(i - 1) == T.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[row][low];
    }
}
