package Demo;

import java.util.Set;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 11:24
 **/
//单词分割
public class demo3 {
    public boolean wordBreak(String s, Set<String> dict) {
        //定义状态 boolean[i]
        //定义状态转移方程 dp[i] = dp[0 ~ i] && dp[i ~ j]
        //初始化 dp[i] = true
        if(s == null){
            return false;
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
