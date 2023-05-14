package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-10 23:07
 **/
// ac 最长上升子序列
public class Demo2 {
    // write your code here
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int max = 1;
            for(int i  = 0;i < n; i++){
                arr[i] = scanner.nextInt();
            }
            int[] dp = new int[n];
            dp[0] = 1;
            for(int i = 1;i < n; i++){
                dp[i] = 1;
                for(int j = i - 1;j >= 0; j--){
                    if(arr[i] > arr[j]){
                        dp[i] = Math.max(dp[i],dp[j] + 1);
                    }
                }
                max = Math.max(dp[i],max);
            }
            System.out.println(max);
        }
    }
}
