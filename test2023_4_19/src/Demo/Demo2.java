package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-19 19:42
 **/
//两个字符串中找到最短的相同的最长子串
public class Demo2 {
    public static String findMaxSub(String s1,String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n + 1][m + 1];
        int start = 0;
        int max = 0;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(arr1[i - 1] == arr2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > max){
                        max = dp[i][j];
                        start = i - max;
                    }
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return s1.substring(start,start + max);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str = null;
            if(str1.length() < str2.length()){
                str = findMaxSub(str1,str2);
            }else {
                str = findMaxSub(str2,str1);
            }
            System.out.println(str);
        }
    }
}
