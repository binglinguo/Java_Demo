package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 22:29
 **/
//连续最大和
public class demo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] array = new int[n];
            for(int i = 0 ; i < n ; i++){
                array[i] = scanner.nextInt();
            }
            int[] dp = new int[n];
            //1.定义状态 dp]i]
            //2.编写状态转移方程  dp[i] = Math.max(dp[i-1] + array[i] , array[i])
            //3.初始化 dp[i] = array[0];
            dp[0] = array[0];
            int max = dp[0];
            for(int i = 1; i < n ; i++){
                dp[i] = Math.max(dp[i - 1] + array[i] , array[i]);
                if(dp[i] > max){
                    max = dp[i];
                }
            }
            System.out.println(max);
        }
    }
}
