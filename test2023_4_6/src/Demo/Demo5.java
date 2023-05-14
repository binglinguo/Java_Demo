package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 22:48
 **/
//杨辉三角变形 error案例 为了偷懒推出了更高效的做法
public class Demo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1 || n == 2){
            System.out.println(0);
            return ;
        }
        int[][] array = new int[n][n];
        for(int i = 0;i < n; i++){
            for(int j = 0;j < i * 2 + 1; j++){
                array[i][0] = 1;
                array[i][j] = 1;
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i * 2 + 1;j++){

            }
        }
    }
}
