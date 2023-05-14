package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-12 21:40
 **/
//幸运袋子
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int ret = DFS(array,0,n,0,1);
        System.out.println(ret);
    }

    public static int DFS(int[] array,int satrt,int end,
                          int sum,int num) {
        int count = 0;
        for (int i = satrt ; i < end ; i++) {
            sum += array[i];
            num *= array[i];
            if (sum > num) {
                count += 1 + DFS(array , i + 1 , end , sum , num);
            } else if (sum == num) {
                count += DFS(array , i + 1 , end , sum , num);
            } else {
                break;
            }
            sum -= array[i];
            num /= array[i];
            while (i + 1 < end && array[i + 1] == array[i]) {
                i++;
            }
        }
        return count;
    }
}
