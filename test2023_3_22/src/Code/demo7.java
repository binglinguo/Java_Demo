package Code;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 21:05
 **/
public class demo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            long m = scanner.nextLong();
            int n = scanner.nextInt();
            if(n == 0 || m == 0){
                System.out.println(0);
                continue;
            }
            StringBuilder str = new StringBuilder();
            for(int i = 31; i >= 0; i--){
                long pow =(long) Math.pow((double)n,(double)i);
                if(m >= pow){
                    long t = (m/pow);
                    if(n > 9 && t > 9){
                        str.append((t - n) + 'a');
                    }else {
                        str.append(t);
                    }
                    m-=t*pow;
                }else {
                    if(str.length() != 0){
                        str.append(0);
                    }
                }
            }
//             if(m > 0){
//                 if(n > 9 && m > 9){
//                     str.append((m - 10) + 'a');
//                 }else {
//                     str.append(m);
//                 }

//             }
            System.out.println(str.toString());
        }
    }
}
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            long m = scanner.nextLong();
//            int n = scanner.nextInt();
//            if(n == 0 || m == 0){
//                System.out.println(0);
//                continue;
//            }
//
//            StringBuilder str = new StringBuilder();
//            if(m < 0){
//                str.append("-");
//                m = -m;
//            }
//
//            for(int i = 31; i >= 0; i--){
//                long pow =(long) Math.pow((double)n,(double)i);
//                if(m >= pow){
//                    long t = (m/pow);
//                    if(n > 9 && t > 9){
//                        str.append((char)(((t - 10) % (n - 1)) + 'A'));
//                    }else {
//                        str.append((char)(t + '0'));
//                    }
//                    m -= t*pow;
//                }else {
//                    if(str.length() != 0){
//                        str.append('0');
//                    }
//                }
//            }
//            System.out.println(str.toString());
//        }
//    }
//}