package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-29 23:08
 **/
//求正整数的最小不可组成合
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] table = new int[n];
        for(int i = 0;i < n; i++){
            table[i] = scanner.nextInt();
        }
        int ret = findMinNumber(table);
        System.out.println(ret);
    }
    public static int findMinNumber(int[] table){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i: table){
            min = Math.min(min,i);
            max += i;
        }
        boolean[] arr = new boolean[max + 1];
        arr[0] = true;
        for(int x : table){
            for(int j = max; j >= x; j--){
                arr[j] = arr[j - x] || arr[j];
            }
        }
        for(int i = min;i <= max; i++){
            if(!arr[i]){
                return i;
            }
        }
        return max + 1;
    }
}
