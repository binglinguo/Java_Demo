package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-19 19:43
 **/
//2.两个字符串中找到最短的相同的最长子串的长度
public class Demo3 {
    public static int findMaxSubLength(String str1,String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= m; j++){
                if(arr1[i - 1] == arr2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(max < dp[i][j]){
                        max = dp[i][j];
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int ret = findMaxSubLength(str1,str2);
            System.out.println(ret);
        }
    }
}

