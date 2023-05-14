package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-08 23:59
 **/
//毒蘑菇
public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            int n = Integer.parseInt(ss[0]);
            int m = Integer.parseInt(ss[1]);
            int k = Integer.parseInt(ss[2]);
            double[][] dp = new double[n + 1][m + 1];
            for (int i = 0; i < k; i++) {
                s = scanner.nextLine();
                ss = s.split(" ");
                int x = Integer.parseInt(ss[0]);
                int y = Integer.parseInt(ss[1]);
                dp[x][y] = -1;
            }
            dp[1][1] = 1;
            for(int i = 1;i <= n; i++){
                for(int j = 1;j <= m; j++){
                    if(dp[i][j] != -1){
                        if(dp[i - 1][j] != -1){
                            dp[i][j] += j == m ? dp[i - 1][j] : dp[i - 1][j] / 2;
                        }
                        if(dp[i][j - 1] != -1){
                            dp[i][j] += i == n ? dp[i][j - 1] : dp[i][j - 1] / 2;
                        }
                    }
                }
            }
            System.out.printf("%.2f\n",dp[n][m]);
        }

    }
}
