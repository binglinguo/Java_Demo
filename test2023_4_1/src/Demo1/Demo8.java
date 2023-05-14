package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 22:17
 **/
public class Demo8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] m = new int[]{1,2,5,10,20,50,100};
        int[] count = new int[7];
        for(int i = 6; i >= 0; i--){
            count[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int l = 6;
        int sum = 0;
        while(num > 0 ){
            for(int i = 6; i >= 0; i--){
                if(num >= m[i]){
                    while(count[i] > 0){
                        num -= m[i];
                        sum++;
                        count[i] = count[i] - 1;
                    }
                }
            }
        }
    }
}
