package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-19 19:15
 **/
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n + 1][m + 1];
        //初始化
        for(int i = 0;i <= n; i++){
            dp[i][0] = i;
        }
        for(int j = 0;j <= m; j++){
            dp[0][j] = j;
        }
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= m; j++){
                dp[i][j] = Math.min(dp[i][j - 1],dp[i - 1][j]) + 1;
                if(arr1[i - 1] == arr2[j - 1]){
                    dp[i][j] = Math.min(dp[i][j],dp[i - 1][j - 1]);
                }else {
                    dp[i][j] = Math.min(dp[i][j],dp[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
