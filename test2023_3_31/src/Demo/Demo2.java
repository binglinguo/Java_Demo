package Demo;

import java.util.Scanner;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-31 22:31
 **/
//查找组成一个数字最接近的 两个数
public class Demo2 {
    public static boolean isSusum(int n){
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //素数 就是除了1和它本身不能被其他数整除的数字即为素数
        int t = n / 2;
        int i = t;
        int j = t;
//        System.out.println(isSusum(9));
        while(true){
            if(isSusum(i) && isSusum(j)){
                if(i + j == n){
                    System.out.println(i);
                    System.out.println(j);
                    return ;
                }
            }
            i--;
            j++;
        }
    }
}
