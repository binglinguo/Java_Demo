package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-07 23:33
 **/
public class demo1 {
    public static int jinzhizhuanhuan(int key,int n) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;
        for(int i = 31;i >= 0; i--) {
            int t = (int) Math.pow(n, i);
            if(key >= t) {
                int ret = key / t;
                sum += array[ret];
                key -= t * ret;
            }
        }
       return sum;
    }

//    public static void main (String[] args) {
//        int ret = jinzhizhuanhuan(126,8);
//        System.out.println(ret);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
       for(int i = 1;i < Integer.MAX_VALUE;i++){
           boolean flg = false;
           if( i % jinzhizhuanhuan(i,2) == 0 &&
               i % jinzhizhuanhuan(i,8) == 0 &&
               i % jinzhizhuanhuan(i,10) == 0 &&
               i % jinzhizhuanhuan(i,16) == 0 ){
               flg = true;
           }
           if(flg){
               count++;
               //System.out.println(i);
           }
           if(count == 2023){
               System.out.println(i);
               break;
           }
       }
    }
}
