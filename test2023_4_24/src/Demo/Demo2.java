package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-24 23:24
 **/
public class Demo2 {
    public static boolean isYear(int year){
        if(year % 4 == 0 && year % 400 != 0 || year % 100 == 0){
            return true;
        }
        return false;
    }
    public static boolean isSushu(int n){
        if( n == 2 || n == 3|| n == 5 || n == 7 || n == 11){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int lastYear = scanner.nextInt();
            int lastMonth = scanner.nextInt();
            int lastDay = scanner.nextInt();
            int[] table = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            int sum = 0;
            if(year == lastYear){
                for(int i = month;i < lastMonth;i++){
                    if(!isSushu(i)){
                        sum += table[i] * 2;
                    }else {
                        sum += table[i];
                    }
                }
                if(isYear(year) && lastMonth > 2 && month <= 2){
                    sum++;
                }
                if(!isSushu(lastMonth)){
                    sum += (lastDay - day + 1) * 2;
                }else {
                    sum += (lastDay - day + 1);
                }
            }
            for(int i = year + 1;i < lastYear; i++){
                for(int j = 1;j <= 12; j++){
                    if(!isSushu(j)){
                        sum += table[j] * 2;
                    }else {
                        sum += table[j];
                    }
                }
                if(isYear(i)){
                    sum++;
                }
            }
            if(year + 1 == lastYear){
                for(int i = 1;i < lastMonth;i++){
                    if(!isSushu(i)){
                        sum += table[i] * 2;
                    }else {
                        sum += table[i];
                    }
                }
                if(isYear(lastYear) && lastMonth >= 2){
                    sum++;
                }
                if(!isSushu(lastMonth)){
                    sum += lastDay * 2;
                }else {
                    sum += lastDay;
                }
            }
            System.out.println(sum);
        }
    }
}
