package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 23:21
 **/
//杨辉三角变形
public class Demo6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = 0;
        if(n == 1 || n == 2){
            ret = -1;
        }else {
            n-=2;
            if(n % 4 == 1 || n % 4 == 3){
                ret = 2;
            }else if(n % 4 == 0){
                ret = 4;
            }else {
                ret = 3;
            }
        }
        System.out.println(ret);
    }
}
