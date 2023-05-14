package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-12 22:55
 **/
//打怪升级
public class Demo4 {
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int[] bi = new int[n];
            for(int i = 0;i < n; i++){
                bi[i] = scanner.nextInt();
            }
            for(int i = 0;i < n; i++){
                if(c > bi[i]){
                    c += bi[i];
                }else {
                    c += fun(c,bi[i]);
                }
            }
            System.out.println(c);
        }
    }
    public static int fun(int n,int m){
        int i = n > m ? m : n;
        while(i >= 1){
            if(n % i == 0 && m % i == 0){
                return i;
            }
            i--;
        }
        return 1;
    }
}
