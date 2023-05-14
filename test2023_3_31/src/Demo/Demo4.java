package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-31 23:26
 **/
//分割回文字符串
public class Demo4 {
    public boolean isHuiWen(String s,int i ,int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int minCut (String s) {
        // write code here
        int n = s.length();
        int[] dp = new int[n + 1];
        //初始化
        for(int i = 0; i <= n; i++){
            dp[i] = i - 1;
        }
        for(int i = 1; i <= n ; i++){
            for(int j = 0; j < i; j++){
                if(isHuiWen(s,j,i - 1)){
                    dp[i] = Math.min(dp[i] , dp[j] + 1);
                }
            }
        }
        return dp[n];
    }
}
