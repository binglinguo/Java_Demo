package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 17:38
 **/
public class Demo3 {
    public static void main (String[] args) {
        int[] array = new int[8];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            array[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = 1;
        int max = sum;
        for(int i = 1; i < 8 ; i++){
            if(array[i] <= array[i - 1]){
                sum++;
            }else {
                max = Math.max(max,sum);
                sum = 0;
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
