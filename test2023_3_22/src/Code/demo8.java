package Code;


import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 22:36
 **/
public class demo8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        String table = "0123456789ABCDEF";
        StringBuilder str = new StringBuilder();
        if(m == 0){
            System.out.println(0);
            return ;
        }
        boolean flg = false;//如果为负数 就是true
        if(m < 0){
            m = -m;
            flg = true;
        }
        while(m > 0){
            str.append(table.charAt(m % n));
            m /= n;
        }
        if(flg){
            str.append("-");
        }
        str.reverse();
        System.out.println(str);
    }
}
