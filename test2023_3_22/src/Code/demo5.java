package Code;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 20:21
 **/
//DP 动态规划连续子数的最大和
public class demo5 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        //定义状态
        int[] dp = new int[array.length];
        //定义状态转移方程 dp[i] = Math.max(dp[i-1] + array[i],array[i])
        //初始化
        dp[0] = array[0];
        int max = dp[0];
        for (int i = 1; i < array.length; i++){
            dp[i] = Math.max(dp[i - 1] + array[i] , array[i]);
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
