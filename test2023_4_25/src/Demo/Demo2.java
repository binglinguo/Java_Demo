package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-25 23:25
 **/
//剪花布条
public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            String sub = scanner.next();
            int m = str.length();
            int n = sub.length();
            int[][] dp = new int[n][m];
            for(int j = 0;j < m; j++){
                dp[0][j] = (str.charAt(j) == sub.charAt(0)) ? 1 : 0;
            }
            for(int i = 1;i < n; i++){
                for(int j = 1;j < m; j++){
                    if(str.charAt(j) == sub.charAt(i)){
                        if(dp[i - 1][j - 1] == 1){
                            dp[i][j] = 1;
                            dp[i - 1][j] = 0;
                        }
                    }
                }
            }
            int sum = 0;
            for(int j = 0;j < m; j++){
                sum += dp[n - 1][j];
            }
            System.out.println(sum);
        }
    }
}
