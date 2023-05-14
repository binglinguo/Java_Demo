package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-17 20:47
 **/
//青蛙跳台阶 动态规划  dp
public class demo1 {
    public int jumpFloor(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= target; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }
}
