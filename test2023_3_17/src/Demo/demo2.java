package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-17 21:15
 **/
//矩形覆盖
public class demo2 {
    public int rectCover(int target) {
        if(target  == 0){
            return 0;
        }
        if(target <= 2){
            return target;
        }
        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= target ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }
}
