package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-30 22:55
 **/
//求连续最大的bit数
public class demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int max = count;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1 )== 1){
                count++;
            }else {
                max = Math.max(count,max);
                count = 0;
            }
        }
        System.out.println(max);
    }
}
